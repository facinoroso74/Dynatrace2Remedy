package it.reply.sytel.adr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.dao.IncidentDAO;
import it.reply.sytel.adr.dao.exc.DaoException;
import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.DynatraceIncidentKey;

public class IncidentDAOImpl implements IncidentDAO {

	//embedded
	//String driver = "org.apache.derby.jdbc.EmbeddedDriver";
	//String protocol = "";
	//String dbName="D:/DerbyDB/IncidentDB";
	
	//network
	String driver = "org.apache.derby.jdbc.ClientDriver";
	String protocol = "//localhost:1527/";
	String dbName="d:/DerbyDB/IncidentDB";
	String connectionURL = "jdbc:derby:"+protocol + dbName; 
	
	javax.sql.DataSource ds=null;
	
	
	private static final String SQL_INSERT_INCIDENT="INSERT INTO INCIDENT(name,heatfield,state,startEvent,duration,"
																	   + "endEvent,source,session,confirmed_by,confirmation,"
																	   + "sensitivity,conditions,thresholds,actions,measures,"
																	   + "datains,dataupdate,remedyTicketId,remedyTicketIdStatus,remedyTicketCreateDate,"
																	   + "dashboardName) "
																+ "VALUES"
																		+ "(?,?,?,?,?,"
																		+  "?,?,?,?,?,"
																		+  "?,?,?,?,?,"
																		+  "?,?,?,?,?,"
																		+  "?)";
			
	private static final String SQL_UPDATE_INCIDENT_DATE_UPDATE="UPDATE INCIDENT set dataupdate=? where name=? and startEvent=?";
	

	private static final String SQL_UPDATE_INCIDENT_WITH_REMEDY_DATA="UPDATE INCIDENT "
			+ 	"set REMEDYTICKETID=?, "
			+	" REMEDYTICKETIDSTATUS=?, "
			+	" REMEDYTICKETCREATEDATE=? "
			+ "where "
			+ 	" name=? "
			+ 	" and startEvent=?";
	
	private static final String SQL_CHECK_INCIDENT_EXIST="SELECT "
																		+ " 	name,"
																	    + " 	startEvent"
																	    + " FROM "
																	    + "     INCIDENT "
																	    + " WHERE "
																	    + " name=?"
																	    + " and startEvent=? "
																	    + " and dashboardName=?";
	
	private static final String SQL_GET_INCIDENT_WITHOUT_REMEDY_TICKET_ID="SELECT "
																			+ " * "
																		    + " FROM "
																		    + "     INCIDENT "
																		    + " WHERE "
																		    + " 	REMEDYTICKETID is null";
	
	
	private static final String SQL_SELECT_INCIDENT_NO_MORE_EXIST="SELECT "
			+ " 	name,"
		    + " 	startEvent,"
		    + "     dashboardName"
		    + " FROM "
		    + "     INCIDENT "
		    + " WHERE "
		    + " dataupdate<?";
	
	private static final String SQL_DELETE_INCIDENT_BY_KEY="DELETE from INCIDENT "
																+ "where "
																+ 	" name=? "
																+ 	" and startEvent=?";
	
	public IncidentDAOImpl() {
		
		ds = new org.apache.derby.jdbc.ClientDataSource();
		((org.apache.derby.jdbc.ClientDataSource) ds).setServerName("localhost");
		((org.apache.derby.jdbc.ClientDataSource) ds).setPortNumber(1527);
		((org.apache.derby.jdbc.ClientDataSource) ds).setDatabaseName("d:/DerbyDB/IncidentDB;create=false");
		//((org.apache.derby.jdbc.ClientDataSource) ds).setTraceDirectory("d:/DerbyDB/myTraceDir");
	}
	
	private Logger log = EtlLogger.getLogger(getClass());
	
	
	private void closeResource(Connection conn, Statement stmt, ResultSet rslt) {
		
		if(rslt!=null)
			try {
				rslt.close();
			} catch (SQLException e) {
				throw new DaoException("Exception on close ResultSet",e);
			}
		if(stmt!=null)
			try {
				stmt.close();
			} catch (SQLException e) {
				throw new DaoException("Exception on close statement",e);
			}
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DaoException("Exception on close connection",e);
			}			
	}
		
	private void checkKey(DynatraceIncidentKey dynatraceIncidentKey) {
		if(dynatraceIncidentKey.getName()==null || dynatraceIncidentKey.getStartEvent()==null)
			throw new DaoException("Excpetion on INcidentDAOImpl. Some key field is null. Name:["+dynatraceIncidentKey.getName()+"] startEvent:["+dynatraceIncidentKey.getStartEvent()+"]");
	}
	
		
	@Override
	public void insertDynatraceIncident(DynatraceIncident dynatraceIncident) {
		
		PreparedStatement stmt=null;
		
		try{
			checkKey(dynatraceIncident.getDynatraceIncidentKey());
			
			Connection conn=ds.getConnection();
			
			stmt=conn.prepareStatement(SQL_INSERT_INCIDENT);
			
			stmt.setString(1, dynatraceIncident.getDynatraceIncidentKey().getName());
			stmt.setString(2, dynatraceIncident.getHeatfield());
			stmt.setString(3, dynatraceIncident.getState());
			stmt.setTimestamp(4, dynatraceIncident.getDynatraceIncidentKey().getStartEvent());
			stmt.setString(5, dynatraceIncident.getDuration());
			stmt.setTimestamp(6, dynatraceIncident.getEndEvent());
			stmt.setString(7, dynatraceIncident.getSource());
			stmt.setString(8, dynatraceIncident.getSession());
			stmt.setString(9, dynatraceIncident.getConfimed_by());
			stmt.setString(10, dynatraceIncident.getConfirmation());
			stmt.setString(11, dynatraceIncident.getSensitivity());
			stmt.setString(12, dynatraceIncident.getConditions());
			stmt.setString(13, dynatraceIncident.getThresholds());
			stmt.setString(14, dynatraceIncident.getActions());
			stmt.setString(15, dynatraceIncident.getMeasures());
			stmt.setTimestamp(16, dynatraceIncident.getDataIns());
			stmt.setTimestamp(17, dynatraceIncident.getDataUpdate());
			stmt.setString(18, dynatraceIncident.getRemedyTicketID());
			stmt.setString(19, dynatraceIncident.getRemedyTicketIDStatus());
			stmt.setTimestamp(20, dynatraceIncident.getRemedyTicketCreateDate());
			stmt.setString(21, dynatraceIncident.getDynatraceIncidentKey().getDashboarName());
			
			int total=stmt.executeUpdate();
			
			if(log.isDebugEnabled())
				log.debug("Updated " + total + " rows");
					
		} catch (Exception e) {
			throw new DaoException("Excpeption into insertDynatraceIncident:["+dynatraceIncident+"]",e);
		} finally {
			closeResource(null,stmt,null);
		}

	}

	@Override
	public boolean alreadyExistsDynatraceIncident(DynatraceIncidentKey dynatraceIncidentKey){
		
		PreparedStatement stmt=null;
		Connection conn = null;
		ResultSet rslt=null;
		
		try{
		    
			conn = ds.getConnection();
			stmt = conn.prepareStatement(SQL_CHECK_INCIDENT_EXIST);
			stmt.setString(1, dynatraceIncidentKey.getName());
			stmt.setTimestamp(2, dynatraceIncidentKey.getStartEvent());
			stmt.setString(3, dynatraceIncidentKey.getDashboarName());
			
			rslt=stmt.executeQuery();
			
			int total=0;
			while (rslt.next()){
				total++;
				
				log.debug("name:["+ rslt.getString("name")+ " startEvent:[" + rslt.getTimestamp("startEvent")+"]");
			}
						
			//DriverManager.getConnection("jdbc:derby:D:/DerbyDB/IncidentDB;shutdown=true");
			
			if(total>0)
				return true;
			
			return false;
					
		}catch (Exception e) {
			throw new DaoException("Exception alreadyExistsDynatraceIncident. dynatraceIncidentKey:["+dynatraceIncidentKey+"]", e);
		} finally {
			closeResource(null, stmt, rslt);
		}
	}


	@Override
	public List<DynatraceIncident> getDynatraceIncidentToClose(Timestamp startToCompare) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DynatraceIncident getDynatraceIncident(DynatraceIncidentKey dynatraceIncidentKey) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void updateDynatraceIncidentDateUpdate(DynatraceIncidentKey dynatraceIncidentKey,Timestamp now) {

		PreparedStatement stmt=null;
		Connection conn = null;
		ResultSet rslt=null;
		
		try{
		    
			conn = ds.getConnection();
			
			stmt = conn.prepareStatement(SQL_UPDATE_INCIDENT_DATE_UPDATE);
			stmt.setTimestamp(1, now);
			stmt.setString(2,dynatraceIncidentKey.getName());
			stmt.setTimestamp(3, dynatraceIncidentKey.getStartEvent());
						
			int total=stmt.executeUpdate();
			
			if(log.isDebugEnabled())
				log.debug("Updated " + total + " rows");
					
			if(total==0)
				throw new DaoException("the DynatraceIncident "+dynatraceIncidentKey+" not updated into table for DATAUPDATE");
			
		}catch (Exception e) {
			throw new DaoException("Exception updateDynatraceIncidentDateUpdate. dynatraceIncidentKey:["+dynatraceIncidentKey+"] and dateupdate:["+now+"]", e);
		} finally {
			closeResource(null, stmt, rslt);
		}
	}

	@Override
	public List<DynatraceIncident> getDynatraceIncidentWithoutRemedyTicketID() {
		
		PreparedStatement stmt=null;
		Connection conn = null;
		ResultSet rslt=null;
		
		List<DynatraceIncident> dynatraceIncidentList = new ArrayList<DynatraceIncident>();
		
		try{
		    
			conn = ds.getConnection();
			stmt = conn.prepareStatement(SQL_GET_INCIDENT_WITHOUT_REMEDY_TICKET_ID);
			
			rslt=stmt.executeQuery();
			
			while (rslt.next()){
				
				DynatraceIncident dynatraceIncident = new DynatraceIncident();
				DynatraceIncidentKey dynatraceIncidentKey = new DynatraceIncidentKey();
				dynatraceIncidentKey.setName(rslt.getString("name"));
				dynatraceIncidentKey.setStartEvent(rslt.getTimestamp("startEvent"));
				dynatraceIncidentKey.setDashboarName(rslt.getString("dashboardName"));
				
				dynatraceIncident.setDynatraceIncidentKey(dynatraceIncidentKey);
				dynatraceIncident.setActions(rslt.getString("actions"));
				dynatraceIncident.setConditions(rslt.getString("conditions"));
				dynatraceIncident.setConfimed_by(rslt.getString("confirmed_by"));
				dynatraceIncident.setConfirmation(rslt.getString("confirmation"));
				dynatraceIncident.setDataIns(rslt.getTimestamp("dataIns"));
				dynatraceIncident.setDataUpdate(rslt.getTimestamp("dataupdate"));
				dynatraceIncident.setDuration(rslt.getString("duration"));
				dynatraceIncident.setEndEvent(rslt.getTimestamp("endEvent"));
				dynatraceIncident.setHeatfield(rslt.getString("heatfield"));
				dynatraceIncident.setId(rslt.getInt("id"));
				dynatraceIncident.setMeasures(rslt.getString("measures"));
				dynatraceIncident.setSensitivity(rslt.getString("sensitivity"));
				dynatraceIncident.setSession(rslt.getString("session"));
				dynatraceIncident.setSource(rslt.getString("source"));
				dynatraceIncident.setState(rslt.getString("state"));
				dynatraceIncident.setThresholds(rslt.getString("thresholds"));
				
				dynatraceIncidentList.add(dynatraceIncident);
				
			}
				
			return dynatraceIncidentList;
					
		}catch (Exception e) {
			throw new DaoException("Exception getDynatraceIncidentWithoutRemedyTicketID", e);
		} finally {
			closeResource(null, stmt, rslt);
		}
	}


	@Override
	public void updateDynatraceIncidentAfterRemedyCall(DynatraceIncident dynatraceIncident) {

		//SQL_UPDATE_INCIDENT_WITH_REMEDY_DATA
		PreparedStatement stmt=null;
		Connection conn = null;
		ResultSet rslt=null;
		
		try{
		    
			conn = ds.getConnection();
			
			stmt = conn.prepareStatement(SQL_UPDATE_INCIDENT_WITH_REMEDY_DATA);
			stmt.setString(1, dynatraceIncident.getRemedyTicketID());
			stmt.setString(2,dynatraceIncident.getRemedyTicketIDStatus());
			stmt.setTimestamp(3, dynatraceIncident.getRemedyTicketCreateDate());
			
			stmt.setString(4, dynatraceIncident.getDynatraceIncidentKey().getName());
			stmt.setTimestamp(5, dynatraceIncident.getDynatraceIncidentKey().getStartEvent());
			
			int total=stmt.executeUpdate();
			
			if(log.isDebugEnabled())
				log.debug("Updated " + total + " rows");
					
			if(total==0)
				throw new DaoException("the DynatraceIncident "+dynatraceIncident+" not updated into table for DataInsert Remedyticket");
			
		}catch (Exception e) {
			throw new DaoException("Exception updateDynatraceIncidentAfterRemedyCall. dynatraceIncident:["+dynatraceIncident+"]", e);
		} finally {
			closeResource(null, stmt, rslt);
		}
	}

	@Override
	public List<DynatraceIncidentKey> getAllDynatraceIncidentNotMoreExist(Timestamp now) {
		PreparedStatement stmt=null;
		Connection conn = null;
		ResultSet rslt=null;
		
		List<DynatraceIncidentKey> dynatraceIncidentKeyList = new ArrayList<DynatraceIncidentKey>();
		
		try{
		    
			conn = ds.getConnection();
			stmt = conn.prepareStatement(SQL_SELECT_INCIDENT_NO_MORE_EXIST);
			
			stmt.setTimestamp(1, now);
			
			rslt=stmt.executeQuery();
			
			while (rslt.next()){
				
				DynatraceIncidentKey dynatraceIncidentKey = new DynatraceIncidentKey();
				dynatraceIncidentKey.setName(rslt.getString("name"));
				dynatraceIncidentKey.setStartEvent(rslt.getTimestamp("startEvent"));
				dynatraceIncidentKey.setDashboarName(rslt.getString("dashboardName"));
				
				dynatraceIncidentKeyList.add(dynatraceIncidentKey);
				
			}
				
			return dynatraceIncidentKeyList;
					
		}catch (Exception e) {
			throw new DaoException("Exception getAllDynatraceIncidentNotMoreExist with sysdate:["+now+"]", e);
		} finally {
			closeResource(null, stmt, rslt);
		}
	}

	@Override
	public void deleteDynaraceIncident(DynatraceIncidentKey dynatraceIncidentKey) {
		
		//SQL_UPDATE_INCIDENT_WITH_REMEDY_DATA
				PreparedStatement stmt=null;
				Connection conn = null;
				ResultSet rslt=null;
				
				try{
				    
					conn = ds.getConnection();
					
					stmt = conn.prepareStatement(SQL_DELETE_INCIDENT_BY_KEY);
					stmt.setString(1, dynatraceIncidentKey.getName());
					stmt.setTimestamp(2,dynatraceIncidentKey.getStartEvent());
					
					int total=stmt.executeUpdate();
					
					if(log.isDebugEnabled())
						log.debug("delete " + total + " rows");
							
					if(total==0)
						throw new DaoException("the DynatraceIncident "+dynatraceIncidentKey+" not delete into table");
					
				}catch (Exception e) {
					throw new DaoException("Exception deleteDynaraceIncident. dynatraceIncidentKey:["+dynatraceIncidentKey+"]", e);
				} finally {
					closeResource(null, stmt, rslt);
				}
	}

}

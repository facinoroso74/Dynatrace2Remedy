package it.reply.sytel.adr.main;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.engine.RemedyIncidetBuilderEngine;
import it.reply.sytel.adr.services.enviromnent.ADREnvironment;


public class TestMain {

	private static Logger log = EtlLogger.getLogger("it.reply.sytel.rma.main.TestMain");
	
	public static void main(String[] args) {
		try{
			Enviromnent envInput = new ADREnvironment();
			
	//		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextCreazioneCompany.xml");
	//		EtlEngineCreazioneCompany  etlEngineCreazioneCompany = (EtlEngineCreazioneCompany)ctx.getBean("engineCreazioneCompany");
	//		envInput.put(EtlEnviromnent.ID_CLIENTE, "1");
	//		Enviromnent envOutput = etlEngineCreazioneCompany.execute(envInput);
	
			
			ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextADR.xml");
			RemedyIncidetBuilderEngine testCaseBuilderEngine = (RemedyIncidetBuilderEngine)ctx.getBean("remedyIncidetBuilderEngine");
			
			Enviromnent envOutput = testCaseBuilderEngine.executeFlow(envInput);
			
			//test per l'aggiornamento del servizio gestito
	//		EtlEngineITSMServizioGestito.testAggiornamentoCreate();
	//		EtlEngineITSMServizioGestito.testAggiornamentoUpdate();
	//		EtlEngineITSMServizioGestito.testAggiornamentoDelete();
			
			//test per l'aggiornamento del servizio contrattualizzato
			
			//test per l'aggiornamento del cliente
			
	//		TestConnectionDB2 testConnectionDB2 = new TestConnectionDB2();
	//		testConnectionDB2.main(args);
		}catch(Exception e){
			log.error(e,e);
		}
	}
	
	
	
}

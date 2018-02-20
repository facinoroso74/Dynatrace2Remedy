package it.reply.sytel.adr.common.quartz;

import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

//@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
//@Startup
//@Singleton
public class QuartzSchedulerBean implements QuartzScheduler{

	private Scheduler sched;
	
	
//	@PostConstruct
	private void startSchedule(){
		try{
	            sched = new StdSchedulerFactory().getScheduler();
	            sched.start();
	            
	            System.out.println("********************QUARTZ SCHEDULER ACTIVE***************");
	           
	            
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	@Lock(LockType.WRITE)
	public synchronized Scheduler getSched() {
		return sched;
	}
	
	private static QuartzScheduler quartzScheduler;
	
	private QuartzSchedulerBean(){	
		startSchedule();
	}
	
	public static synchronized QuartzScheduler getInstance(){
		
		if(quartzScheduler==null){
			quartzScheduler = new QuartzSchedulerBean();
		}
		return quartzScheduler;
	}
}

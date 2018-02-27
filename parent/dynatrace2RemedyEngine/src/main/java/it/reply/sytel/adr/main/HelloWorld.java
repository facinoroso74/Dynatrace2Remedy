package it.reply.sytel.adr.main;

import java.sql.Timestamp;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

@DisallowConcurrentExecution
public class HelloWorld implements Job{

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("Hello World..........."+ new Timestamp(System.currentTimeMillis()));
	}
}

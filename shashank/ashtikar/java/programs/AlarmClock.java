package shashank.ashtikar.java.programs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
 * Author: Shashank Ashtikar
 * 
 * This class functions as an alarm clock. The alarm will sound for two minutes
 * and then it will turn itself off.
 * 
 */


public class AlarmClock{

	public static void main(String args[]) throws InterruptedException
	{
		final Date date = new Date();
		final int hour=22;
		final int minute=35;
		
		final DateFormat dfHour = new SimpleDateFormat("HH");
		final DateFormat dfMinute = new SimpleDateFormat("mm");
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				int refHour =Integer.parseInt(dfHour.format(date));
				int refMinute = Integer.parseInt(dfMinute.format(date));
				
				System.out.println("Current Hour is: "+hour+ " and the minute is: "+minute);
				
				if(refHour==hour&&refMinute==minute)
				{
					System.out.println("Beep !!!");
				}
				
			}
		};
		
		ScheduledExecutorService es = Executors.newScheduledThreadPool(1);
		es.schedule(task, 1, TimeUnit.SECONDS);
		Thread.sleep(120000);
		es.shutdownNow();
	}
	
	}

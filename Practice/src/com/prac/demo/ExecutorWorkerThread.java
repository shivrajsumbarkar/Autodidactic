 package com.prac.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorWorkerThread {
	public static void main(String [] args) {
		
		threadExecutor();
	}
	
	public static void threadExecutor()
	{
		//newCachedThreadPool---> creates new thread if needed dynamically
		ExecutorService executorService=Executors.newFixedThreadPool(5);
		for(int i=0;i<20;i++)
		{
			executorService.execute(new WorkerThread(i+""));
		}
		executorService.shutdown();
		System.out.println("All tasks are completed");
	}

}

class WorkerThread implements Runnable{
	
	public void run()
	{
		System.out.println("Run method called by thread: "+Thread.currentThread().getName());
	}
	
	public WorkerThread(String task)
	{
		System.out.println("Task Excecuted: "+task+" by thread: "+Thread.currentThread().getName());
	}
	
}

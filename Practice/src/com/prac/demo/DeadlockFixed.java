package com.prac.demo;

/**
 * DESC:: Provide order access to avoid deadlock like which avoids deadlock by
 * avoiding circular wait with no preemption
 * 
 * @author SHIVRAJ S. UMBARKAR
 *
 */
public class DeadlockFixed {

	public static void main(String[] args) {
		String resource1="resource1";
		String resource2="resource2";
		
		Thread t1=new Thread() {
			public void run() {
				synchronized(resource1)
				{
					System.out.println("Thread 1::Locked resource1");
					synchronized(resource2)
					{
						System.out.println("Thread 1::Locked resource2");
					}
			}
		}

	};
	
	Thread t2=new Thread() {
		public void run() {
			synchronized(resource1)
			{
				System.out.println("Thread 2:: Locked resource1");
				
				synchronized(resource2)
				{
					System.out.println("Thread 2:: Locked resource2");
					
				}
			}
		}
		
	};
	t1.start();
	t2.start();
			

}

}
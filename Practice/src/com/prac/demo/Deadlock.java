package com.prac.demo;
/**
 * Def:: When a Thread 1 is waiting for an object lock, that is acquired by Thread 2.
 * 		 and Thread 2 is waiting for an object lock , that is acquired by Thread 1.
 * 		 Since, both thread are waiting for each other to release the lock.
 * 			this condition is called Deadlock
 * DESC:: How to detect Deadlock
 * 		1.Check nested synchronized blocks
 * 		2.Check Thread dump and you can see which thread is locked on which object
 * @author SHIVRAJ S. UMBARKAR
 *
 */
public class Deadlock {

	public static void main(String[] args) {
		String resource1="resource1";
		String resource2="resource2";
		
		Thread t1=new Thread() {
			public void run()
			{
				synchronized (resource1) {
					System.out.println("Thread 1::Locked Resource1");
					
					synchronized (resource2) {
						System.out.println("Thread 1::Locked Resource2");
					}
					
				}
			}
		};
		
		Thread t2= new Thread(){
		public void run()
		{
			synchronized(resource2)
			{
				System.out.println("Thread 2::Locked Resource2");
				
			synchronized(resource1)
			{
				System.out.println("Thread 2::Locked Resource1");
			}
			}
			
		}

	};

	t1.start();
	t2.start();
}
}

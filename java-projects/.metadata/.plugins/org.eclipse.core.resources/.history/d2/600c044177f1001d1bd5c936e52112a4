package demomt06.lambdatask;

import in.conceptarchitect.utils.ThreadUtils;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread thread1=new Thread(()-> countDown(200));
		
		Thread thread2=new Thread(()-> countDown(300));
		
		Thread thread3=new Thread(Program::quickCountDown);
		
		
		
		
		thread1.start(); //runs task on a separate thread
		thread2.start(); //runs task on a separate thread
		thread3.start(); //runs task on a separate threads
		
		
		//busyMain();
		
		//isAliveWait(thread1, thread2, thread3);
		
		//Thread.sleep(5000); //main will sleep for 5 seconds
		
		//sleepyMain();
		
//		thread1.join();  //I will sleep till thread1 (ends) and joins me
//		thread2.join();
//		thread3.join();
		
		ThreadUtils.waitFor(thread1,thread2,thread3);
		
		
		

		
		System.out.printf("\n[%d] Main Ends\n", Thread.currentThread().getId());
		
		
	}

	private static void sleepyMain() {
		ThreadUtils.sleep(5000);
	}

	private static void isAliveWait(Thread thread1, Thread thread2, Thread thread3) {
		while( thread1.isAlive() || thread2.isAlive() || thread3.isAlive())
			System.out.print("+");
	}

	private static void busyMain() {
		//keep main busy		
		for(int i=0;i<10000;i++)
			System.out.print("+");
	}
	
	static void quickCountDown() {
		countDown(100);
	}
	
	public static void countDown(int max) {
		
		
		var threadId = Thread.currentThread().getId();
		
		System.out.printf("[%d] starts\n", threadId);
		
		while(max>=0) {
			System.out.printf("[%d] counts %d\n", threadId,max);
			max--;
		}
		
		System.out.printf("[%d] ends\n", threadId);
		
		
	}


}

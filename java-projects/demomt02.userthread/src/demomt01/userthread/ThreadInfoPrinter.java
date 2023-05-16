package demomt01.userthread;

public class ThreadInfoPrinter implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Thread is "+Thread.currentThread().getName());
		
	}

}

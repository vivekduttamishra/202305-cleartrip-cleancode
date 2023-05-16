package demomt01.multiplethreads;

public class CountDownTask implements Runnable{

	@Override
	public void run() {
		
		int max=100;
		var threadId = Thread.currentThread().getId();
		
		System.out.printf("[%d] starts\n", threadId);
		
		while(max>=0) {
			System.out.printf("[%d] counts %d\n", threadId,max);
			max--;
		}
		
		System.out.printf("[%d] ends\n", threadId);
		
		
	}

}

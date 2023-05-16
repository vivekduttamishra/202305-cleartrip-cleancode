package in.conceptarchitect.utils;

public class ThreadUtils {
	
	public static void sleep(long ms) {
		
		try {
			Thread.sleep(ms);
		}catch(InterruptedException ex) {
			throw new ThreadInterruptedException(ex.getMessage(),ex);
		}
	}
	
	public static void waitFor( Thread ...threads) {
		
		for(var thread : threads) {
			try {
				thread.join();
			}catch(InterruptedException ex) {
				throw new ThreadInterruptedException(ex.getMessage(), ex);
			}
		}
		
	}

}

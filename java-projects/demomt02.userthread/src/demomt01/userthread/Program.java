package demomt01.userthread;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var task=new ThreadInfoPrinter();
		
		var thread=new Thread(task);
		
		thread.start(); //runs task on a separate thread
		
		task.run(); //runs task on the main thread
		
		
	}

}

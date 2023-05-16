package demomt09.sharedresource;

import in.conceptarchitect.utils.ThreadUtils;

public class Program {

	public static void main(String[] args) {
		var manager=new Manager();
		
		manager.schedule(1000, 10000, true);
	}
	


}

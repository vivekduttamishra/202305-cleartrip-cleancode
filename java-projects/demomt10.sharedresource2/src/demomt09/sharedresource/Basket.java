package demomt09.sharedresource;

public class Basket {
	
	long items;
	
	public  void add() {
		
		var i=items;
		
		i++;
		
		items=i;
	}

	public long getItems() {
		return items;
	}
	
	

}

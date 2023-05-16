package in.conceptarchitect.collections;

public class StackOverflowException extends RuntimeException {
	
	Object itemPushed;
	
	public StackOverflowException(Object itemPushed) {
		super("Stack Overflow while pushing "+itemPushed);
		this.itemPushed=itemPushed;
		
	}

	public Object getItemPushed() {
		return itemPushed;
	}
	
	

}

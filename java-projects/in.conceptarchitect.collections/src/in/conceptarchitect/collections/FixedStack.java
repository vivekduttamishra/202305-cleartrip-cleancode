package in.conceptarchitect.collections;

public class FixedStack<E> {
	
	//boolean empty=true;
	//boolean full=false;
	int count=0;
	private int size=0;
	Object[] items;

	public FixedStack(int size) {
		// TODO Auto-generated constructor stub
		this.size=size;
		items=new Object[size];
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		//return empty;
		return count==0;
	}

	
	public void push(E value) {
		// TODO Auto-generated method stub
		if(isFull())
			throw new StackOverflowException(value);
//		empty=false;
//		full=true;
		items[count]=value;
		count++;
		//this.value=value;
		
		
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		return count==size;
	}

	public E pop() {
		// TODO Auto-generated method stub
		
		if(isEmpty())
			throw new StackUnderflowException();
		count--;
		return (E)items[count];
		
		
	}

}

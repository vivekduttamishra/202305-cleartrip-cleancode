package demo01.rectangle;

public class RSquare extends ProperRectangle {

	public RSquare(double side) {
		super(side,side);
	}
	@Override 
	public Orientation getOrientation() {
		// TODO Auto-generated method stub
		throw new RuntimeException("Orientation is Not supported");
	}
}

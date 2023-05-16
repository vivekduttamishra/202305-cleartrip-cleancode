package demo01.rectangle;

class ProperRectangle extends Rectangle{

	double width, height;
	
	public ProperRectangle(double width, double height){
		this.width=width;
		this.height=height;
	}
	
	@Override
	public double area(){
		return width*height;
	}
	
	@Override
	public double perimeter(){
		return 2*(width+height);
	}
	
	@Override
	public void draw(){
		System.out.println( "[" + width+"," + height+ "] ");
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Orientation getOrientation(){
		if(width>height)
			return Orientation.horizontal;
		else
			return Orientation.vertical;
	}

}


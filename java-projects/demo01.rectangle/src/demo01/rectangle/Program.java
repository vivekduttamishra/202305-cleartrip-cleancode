package demo01.rectangle;

public class Program {

	public static void main(String[]args) {
		
		Rectangle [] rectangles= {
				new ProperRectangle(4,8),
				new RSquare(8),
				new Square(8),
				new ProperRectangle(9,2)
		};
		
		
		for(Rectangle rectangle :rectangles) {
			System.out.println(rectangle);
			System.out.println("Area:"+ rectangle.area());
			System.out.println("Perimeter:"+rectangle.perimeter());
			rectangle.draw();
			if(rectangle instanceof ProperRectangle) {
				
				var r= (ProperRectangle) rectangle;
				System.out.println("Orientation:"+r.getOrientation());	
			}
			
			System.out.println();
		}
		
		var s=new RSquare(8);
		s.setHeight(12);
		s.draw();
	}
	
}

package flyWeightPattern;

public class FlyWeightPatternDemo {
	
	private static  String colors[] = {"red","green","black"};
	
	public static void main(String[] args) {
		
		System.out.println("########### RED COLOR ##############");
		for(int i=0;i<5;i++) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[0]);
			circle.draw();
		}
		
		System.out.println("########### GREEN COLOR ##############");
		for(int i=0;i<5;i++) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[1]);
			circle.draw();
		}
		
		System.out.println("########### BLACK COLOR ##############");
		for(int i=0;i<5;i++) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[2]);
			circle.draw();
		}
	}

}

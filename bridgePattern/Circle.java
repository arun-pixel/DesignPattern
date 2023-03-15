package bridgePattern;

public class Circle extends Shape{

	public Circle(Color color) {
		super(color);
	}

	public void applyColor() {
		System.out.print("Circle filled with color ");
		color.applyColor();	
	}

}

package bridgePattern;

public class Triangle extends Shape{

	public Triangle(Color color) {
		super(color);
	}

	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	}

}

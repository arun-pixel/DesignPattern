package flyWeightPattern;

public class Circle implements Shape{
	
	private String color;
	
	public Circle() {
		
	}
	
	public Circle(String color) {
		this.color = color;
	}
	
	public void setColor(String color) {
		 this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void draw() {
		System.out.println(this+" : "+color+" Circle");	
	}
	
	

}

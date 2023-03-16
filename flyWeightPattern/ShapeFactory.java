package flyWeightPattern;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap<String,Shape> shapeMap = new HashMap<String,Shape>();
	
	public static Shape getShape(String shapeType) {
		Shape shape = null;
		
		if(shapeType.equals("circle")) {
			
			shape =  shapeMap.get("circle");
			
			if(shape == null) {
				shape = new Circle();
				shapeMap.put("circle", shape);
				System.out.println("Creating Circle Object  without any color in ShapeFactory "+shape+"\n");
			}
		}
		return shape;
	}
	
	
}

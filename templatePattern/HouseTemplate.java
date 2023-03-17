package templatePattern;

public abstract class HouseTemplate {
	
	public final void buildHouse(){
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}
	
	public abstract void buildWalls();
	public abstract void buildPillars();

	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}


	private void buildFoundation() {
		System.out.println("Building foundation with cement and iron rods");
	}


}

package compositePattern;

public class CompositeTest {
	
	public static void main(String[] args) {
		
		Component hardDrive = new Leaf(3000,"HARD_DRIVE");
		Component ram = new Leaf(3500,"RAM");
		Component cpu = new Leaf(7000,"CPU");
		Component mouse = new Leaf(500,"MOUSE");
		Component monitor = new Leaf(9000,"MONITOR");
		
		Composite computer = new Composite("COMPUTER");
		Composite peripherals = new Composite("PERIPHERALS");
		Composite cabinet = new Composite("CABINET");
		Composite motherBoard = new Composite("MOTHERBOARD");
		
		motherBoard.addComponent(ram);
		motherBoard.addComponent(cpu);
		
		peripherals.addComponent(mouse);
		peripherals.addComponent(monitor);
		
		cabinet.addComponent(hardDrive);
		cabinet.addComponent(motherBoard);
		
		computer.addComponent(cabinet);
		computer.addComponent(peripherals);
		
		//computer.showPrice();
		
		peripherals.showPrice();





	}

}

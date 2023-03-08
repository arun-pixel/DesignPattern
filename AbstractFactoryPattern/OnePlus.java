package AbstractFactoryPattern;

public class OnePlus extends Device{

	private int ramSize;
	private String processer;
	
	public OnePlus(int ramSize,String processer){
	   this.ramSize = ramSize;
	   this.processer = processer;
		
	}

	public String getDetails() {
       return "OnePlus : RamSize: "+ramSize+" Processer :";
	}

}

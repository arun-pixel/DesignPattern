package AbstractFactoryPattern;

public class MacBook extends Device{
	
	private int ramSize;
	private String processer;
	private String gpu;
	
	public MacBook(int ramSize,String processer,String gpu){
		 this.ramSize = ramSize;
		 this.processer = processer;
		 this.gpu = gpu;
	}

	public String getDetails() {
       return "MacBook : RamSize: "+ramSize+", Processer :"+processer+", gpu : "+gpu;
	}

}

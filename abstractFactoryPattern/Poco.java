package abstractFactoryPattern;

public class Poco extends Device{

	private int ramSize;
	private String processer;
	
	public Poco(int ramSize,String processer){
		   this.ramSize = ramSize;
		   this.processer = processer;		
		}


	public String getDetails() {
       return "Poco : RamSize: "+ramSize+" Processer :";
	}
	
}

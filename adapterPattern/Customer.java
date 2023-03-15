package adapterPattern;

public class Customer {
	
	public static void main(String[] args) {
		
		MobileChargerAdapter adapter = new MobileNewGen();
		
		System.out.println(adapter.chargeWithTypeC());
		
		
	}

}

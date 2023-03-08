package builderPattern;

public class MobileStore {
	
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile("snapDragon","android",5000,"LED");
		
		System.out.println(mobile);
		
		Mobile mobile2 = new MobileBuilder().setProcessor("Mediatech").setOs("ios").getMobile();
		
		System.out.println(mobile2);
	}

}

package adapterPattern;

public class MobileNewGen implements MobileChargerAdapter{
	
	MobileCharger charger;
	
	public MobileNewGen() {
		this.charger = new Mobile();
	}

	public String chargeWithTypeC() {
           return charger.charge()+" with Flat Pin";
	}

}

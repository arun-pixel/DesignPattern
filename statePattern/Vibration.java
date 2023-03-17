package statePattern;

public class Vibration implements MobileAlertState {
	
	public void alert(AlertStateContext context)
    {
        System.out.println(" vibration... ");
    }

}

package statePattern;

public class Silent implements MobileAlertState{
	
	public void alert(AlertStateContext context)
    {
        System.out.println(" silent..  ");
    }

}

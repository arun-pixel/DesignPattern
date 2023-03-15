package proxyPattern;

public class RealInternet implements Internet{

	public void connect(String site) {

		System.out.println("connecting to "+site);
	}

}

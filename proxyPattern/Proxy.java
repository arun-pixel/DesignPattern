package proxyPattern;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements Internet{
	
	private Internet internet = new RealInternet();
	
	private  List<String> bannedSites;
	
	public Proxy() {
		bannedSites = new ArrayList<String>();
		bannedSites.add("tamilRockerz.com");
		bannedSites.add("moviesNow.com");
	}

	public void connect(String site) {
						
		if(bannedSites.contains(site)) {
			System.out.println("Access denied : BANNED SITE");
		}
		else {
			internet.connect(site);
		}
		
				
	}

}

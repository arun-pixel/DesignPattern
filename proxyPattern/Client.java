package proxyPattern;

public class Client {
	
	public static void main(String[] args) {
		
		Internet internet = new Proxy();
				
		internet.connect("tamilRockerz.com");
		
		internet.connect("movies.com");

		
	}

}

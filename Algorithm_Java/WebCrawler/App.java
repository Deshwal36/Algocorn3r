package WebCrawler;

public class App {
	
	public static void main(String[] args) {
		
		WebCrawler crawler = new WebCrawler();
		
		String rooturl = "http://www.bbc.com";
		crawler.DiscoverWeb(rooturl);
		
			
	}

}

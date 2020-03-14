 package WebCrawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
	
	private Queue<String> queue;
	private List<String> DiscoveredWebsiteList;
	
    public WebCrawler(){
    	
    	this.queue = new LinkedList<>();
    	this.DiscoveredWebsiteList = new ArrayList<>();
    	
    }
    
    public void DiscoverWeb(String root) {
    	this.queue.add(root);
    	this.DiscoveredWebsiteList.add(root);
    	
    	while( !queue.isEmpty()) {
    		
    		String v = this.queue.remove();
    		
    	    String rawHtml = readURL(v);
    	    System.out.println("rawHtml\n" +  rawHtml);
    	    String regexp = "https://[\\w.]+";
    	    
    	    Pattern pattern = Pattern.compile(regexp);
    	    System.out.println("pattern" + pattern);
    	    Matcher matcher = pattern.matcher(rawHtml);
    	    System.out.println("matcher.find() :" + matcher.find());
    	    
    	    while( matcher.find()) {
    	    	
    	    		String actualurl = matcher.group();
    	    		//System.out.println(actualurl);
    	    		
    	    		if(! DiscoveredWebsiteList.contains(actualurl)) {
    	    			
    	    			DiscoveredWebsiteList.add(actualurl);
    	    			System.out.println("Website has been found with URL :" + actualurl);
    	    		    queue.add(actualurl);
    	    		}
    	       }
    	 }
    }	

	private String readURL(String v) {
		
		String rawHtml = "";
		
		try {
			
			URL url = new URL(v);
			System.out.println("Host :" + url.getHost());
			URLConnection urlcon = url.openConnection();
		    urlcon.setDoInput(true);
			BufferedReader in = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
			//System.out.println(in.readLine());
			String inputLine = "";
			
			while( (inputLine = in.readLine()) != null ) {
				
				rawHtml += inputLine;
				//System.out.println("Source " + inputLine);
				
			}
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rawHtml;
	}
    

}

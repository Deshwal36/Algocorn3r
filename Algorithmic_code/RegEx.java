import java.util.*;
import java.util.Scanner;
import java.util.regex.*;

public class RegEx {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String Phone = in.nextLine();
		
		Pattern p=Pattern.compile("(ABC)",Pattern.CASE_INSENSITIVE);
		System.out.println("pattern : " + p);
		Matcher m=p.matcher(Phone);
		int hit=0;
		while(m.find()) {
		
		System.out.println("Start :"  + m.start() + "End : " + (m.end()-1) );
        System.out.println(m.group());
        hit++;
	}
		
		//System.out.println("Count : " + m.groupCount());
		System.out.println("Count : " + hit);
	in.close();
	}


}

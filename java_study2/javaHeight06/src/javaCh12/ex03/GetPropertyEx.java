package javaCh12.ex03;

import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

public class GetPropertyEx {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String javaHome = System.getProperty("java.home");
		String userDir = System.getProperty("user.dir");
		String jsVersion = System.getProperty("java.specification.version");
		
		System.out.println(osName+" "+ userName+" "+userHome+" "+javaHome);
		System.out.println(userDir+" "+jsVersion);
		
		
		Properties pp = System.getProperties();
		boolean isOsName = pp.containsKey("os.name");
		System.out.println(isOsName);
		
		int ps = pp.size();
		System.out.println(ps);
		
		Collection<Object> pv = pp.values();
		Iterator<Object> pvi = pv.iterator();
		while(pvi.hasNext()) {
			System.out.println(pvi.next());
		}
		System.out.println(pv);
	}

}

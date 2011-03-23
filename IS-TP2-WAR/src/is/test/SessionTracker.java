package is.test;

import java.util.Hashtable;

public class SessionTracker {
	
	public static Hashtable  <Long, AccountBeanRemote> beans = null;
	private static Long id;
	
	public static AccountBeanRemote getBean(Long id){
		if (beans != null && id != null)
			return beans.get(id);
		else
			return null;
	}
	
	
	public static Long setBean(AccountBeanRemote ac){
		if (beans == null){
			beans = new Hashtable<Long, AccountBeanRemote>();
			id = new Long(1);
		}
		
		beans.put(id++, ac);
		
		return id-1;
	}

}

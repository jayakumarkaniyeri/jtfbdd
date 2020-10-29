package stepDefinitions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DataStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> capital = new HashMap<String, String>();
		capital.put("Kerala", "TVM");
		capital.put("Karnataka", "Bengaluru");
		capital.put("Maharashtra", "Mumbai");
		capital.put("Tamil Nadu", "Chennai");
			
		Iterator<String> it = capital.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = capital.get(key);
			System.out.println(key+ ":" + value);
		}
		
		Iterator<Entry<String, String>> it1 = capital.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		
		
 		
	}

}

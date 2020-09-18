package ibm.com.map.hashmap;

import java.util.HashMap;
import java.util.Set;

public class KeySetToGetValueMethod {
public static void main(String []args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("ABC001", "Kevin");
		map.put("ABC002", "Lily");
		map.put("ABC003", "Bob");
		map.put("ABC004", "Zombie");

		//��ȡ����key
		Set<String> keys = map.keySet(); 
		for(String key: keys) {
		     //ͨ��Key����Value
			String value = map.get(key); 
			System.out.println("ID:"+key+"--Name: "+value);
		}
	}
}

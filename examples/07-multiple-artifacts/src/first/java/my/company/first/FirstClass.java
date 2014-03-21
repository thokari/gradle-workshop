package my.company.first;

import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.map.LinkedMap;

public class FirstClass {

	static {
		OrderedMap<String, String> map = new LinkedMap<String, String>();
		map.put("One", "1");
	}
}

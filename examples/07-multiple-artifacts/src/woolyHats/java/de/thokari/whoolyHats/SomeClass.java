package de.thokari.whoolyHats;

import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.map.LinkedMap;

public class SomeClass {

	static {
		OrderedMap<String, String> map = new LinkedMap<String, String>();
		map.put("One", "1");
	}
}

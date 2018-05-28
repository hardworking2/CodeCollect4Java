package com.cmic.HelloWorld4Java.util.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.cmic.HelloWorld4Java.help.Tips;

@Tips(description = "集合框架-Map")
public class MapUtil {

	static Map<String, String> targetMap = new HashMap<String, String>();

	@Tips(description = "遍历Map,效率高")
	public static void loopAllTheMap() {
		Iterator<Map.Entry<String, String>> it = targetMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println("MapKey" + entry.getKey());
		}
	}

}

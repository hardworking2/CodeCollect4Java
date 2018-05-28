package com.cmic.HelloWorld4Java.util.collection;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

import org.junit.Test;

import com.cmic.HelloWorld4Java.help.Tips;

public class PropertyUtil {

	@Tips(description = "获取全局参数并遍历")
	public static void loopTheSystemProperty() {
		Properties properties = System.getProperties();
		Iterator it = properties.entrySet().iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			System.err.println("key为" + entry.getKey() + " value为" + entry.getValue());
		}
	}
	
	@Test
	public void test() {
		loopTheSystemProperty();
	}
}

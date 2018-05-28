package com.cmic.HelloWorld4Java;

import org.junit.Test;

import com.cmic.HelloWorld4Java.help.Tips;

public class AppTest {

	@Tips(description = "测试split无匹配的情况")
	@Test
	public void check0() {
		String temp = "xiaoMiN3";
		System.out.println(temp.split(",")[1]);
		// FINDING 数组越界，没有匹配则全部字符串输出作为第一个数组元素
	}
}

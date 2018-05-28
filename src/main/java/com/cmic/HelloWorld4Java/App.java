package com.cmic.HelloWorld4Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import com.cmic.HelloWorld4Java.bean.TestInfo;
import com.cmic.HelloWorld4Java.util.log.LogUtil;
import com.cmic.HelloWorld4Java.util.time.TimeUtil;

public class App {

	static {
		PropertyConfigurator.configure(new File("res/log4j/log4j.properties").getAbsolutePath());
	}

	@Test
	public void goTest() {
		String s = "adbshell a aa aa adb shell";
		if (s.startsWith("adb shell ")) {
			StringBuilder sb = new StringBuilder(s);
			sb.insert(s.indexOf("adb") + 4, " ").insert(s.indexOf("adb") + 4, "-s cf125231");
			System.out.println(sb.toString());
		} else {
			Assert.assertTrue(false);
		}
	}

	public static void main(String[] args) {
		LogUtil.w("Hello Java, I Will Keep Learn!!!");
	}

	public static void check2() throws FileNotFoundException {
		Yaml yaml = new Yaml();
		TestInfo info = yaml.loadAs(new FileInputStream(new File("target/deviceInfo/device.yaml")), TestInfo.class);
		System.out.println(info.getTestDeviceList().length);
	}

	public static void check1() throws FileNotFoundException {
	}

	public static void check0() throws IOException {
		// TestInfo info = new TestInfo();
		// // 订阅者列表
		// info.setTestBranch("master");
		// info.setTestSubscriber(new String[] { "kiwi188141@163.com", "ikiwi@139.com"
		// });
		// // 设备列表
		// Device d1 = new Device("N3", 26, "cf130961");
		// Device d2 = new Device("Xiaomi6", 25, "xs214b1");
		// info.setTestDeviceList(new Device[] { d1, d2 });
		// // 转换
		// Yaml yaml = new Yaml();
		// File file = new File("target/deviceInfo", "device.yaml");

		// yaml.dump(info.getTestDeviceList(), new FileWriter(file.getAbsolutePath()));
	}

}

// # 自动化测试配置信息
// testBranch: MMNES1.5 # 目标的测试分支
// testDeviceList: # 测试设备列表 格式为：{设备名,目标SDK,UID}
// -
// deviceName: N3
// deviceSDK: 26
// deviceUid: cf130961
// -
// deviceName: Xiaomi6
// deviceSDK: 25
// deviceUid: xs214b1
// testSubscriber: # 测试报告订阅用户
// - kiwi188141@163.com
// - ikiwi@139.com

package com.cmic.HelloWorld4Java.bean;

import com.cmic.HelloWorld4Java.help.Tips;

@Tips(description = "测试类，表征一个测试配置信息的全文")
public class TestInfo {
	private String testBranch;// 测试的分支
	private String[] testSubscriber;// 测试报告订阅者
	private Device[] testDeviceList;

	public String getTestBranch() {
		return testBranch;
	}

	public void setTestBranch(String testBranch) {
		this.testBranch = testBranch;
	}

	public String[] getTestSubscriber() {
		return testSubscriber;
	}

	public void setTestSubscriber(String[] testSubscriber) {
		this.testSubscriber = testSubscriber;
	}

	public Device[] getTestDeviceList() {
		return testDeviceList;
	}

	public void setTestDeviceList(Device[] testDeviceList) {
		this.testDeviceList = testDeviceList;
	}
}
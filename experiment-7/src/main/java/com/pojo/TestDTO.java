package com.pojo;

import java.util.List;

public class TestDTO {
	private List<Test> testList;
	
	public List<Test> getTestList() {
		return testList;
	}
	
	public void setTestList(List<Test> testList) {
		this.testList = testList;
	}
	
	@Override
	public String toString() {
		return "TestDTO [testList=" + testList + "]";
	}
}

package com.pojo;

import java.util.List;

public class Test {
	private String stringValue;
	private int intValue;
	private List<String> stringArray;
	
	
	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
	public int getIntValue() {
		return intValue;
	}
	
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	
	public List<String> getStringArray() {
		return stringArray;
	}
	
	public void setStringArray(List<String> stringArray) {
		this.stringArray = stringArray;
	}
	
	@Override
	public String toString() {
		return "Test [stringValue=" + stringValue + ", intValue=" + intValue + ", stringArray=" + stringArray + "]";
	}
}



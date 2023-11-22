package demo1.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private String name;
	private int age;
	private String address;
	private List<String> list;
	private Set<String> set;
	private Map<String,String> map;
	private String[] strArray;
	
	public Student() {
		super();
	}
	
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public List<String> getList() {
		return list;
	}



	public void setList(List<String> list) {
		this.list = list;
	}



	public Set<String> getSet() {
		return set;
	}



	public void setSet(Set<String> set) {
		this.set = set;
	}



	public Map<String, String> getMap() {
		return map;
	}



	public void setMap(Map<String, String> map) {
		this.map = map;
	}



	public String[] getStrArray() {
		return strArray;
	}



	public void setStrArray(String[] strArray) {
		this.strArray = strArray;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", list=" + list + ", set=" + set
				+ ", map=" + map + ", strArray=" + Arrays.toString(strArray) + "]";
	}



	
	
	
}

package demo2.bean;

public class Hospital {
	private String name;
	private String address;
	private Department department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Hospital [name=" + name + ", address=" + address + ", department=" + department + "]";
	}
	
	
	
}

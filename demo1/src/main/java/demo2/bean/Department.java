package demo2.bean;

public class Department {
	private String name;
	private String director;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", director=" + director + "]";
	}
	
	
}

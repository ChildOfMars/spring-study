package com.bean;

public class Student {
	private int id;
	private String name;
	private float chinese;
	private float math;
	private float english;
	private float sumScore;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getChinese() {
		return chinese;
	}
	public void setChinese(float chinese) {
		this.chinese = chinese;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public float getSumScore() {
		return sumScore;
	}
	public void setSumScore(float sumScore) {
		this.sumScore = sumScore;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", chinese=" + chinese + ", math=" + math + ", english="
				+ english + ", sumScore=" + sumScore + "]";
	}
	
	
}

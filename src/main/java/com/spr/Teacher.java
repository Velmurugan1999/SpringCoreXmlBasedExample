package com.spr;

public class Teacher {
	private int id;
	private String name;
	private String department;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void init() {
		System.err.println("Teacher bean is Initiated........");
	}
	public void destroy() {
		System.err.println("teacher bean is going to destroy...........");
	}
	@Override
	public String toString() {
		return "Id:"+this.getId()+"   Name:"+this.getName()+"   Department: "+this.getDepartment();
	}
}

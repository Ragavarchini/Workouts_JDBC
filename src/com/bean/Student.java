package com.bean;



public class Student {
	private int s_id;
	private String Name;
	private String Address;
	private int Marks;
	
	
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", Name=" + Name + ", Address=" + Address + ", Marks=" + Marks + "]";
	}
	
}

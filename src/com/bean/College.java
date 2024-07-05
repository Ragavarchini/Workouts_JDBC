package com.bean;

public class College {
	private int id;
	private String cname;
	
	private String cadd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCadd() {
		return cadd;
	}

	public void setCadd(String cadd) {
		this.cadd = cadd;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", cname=" + cname + ", cadd=" + cadd + "]";
	}
	
	
}

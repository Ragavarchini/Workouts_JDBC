package com.dev1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@Column(name="P_id")
	private int pid;
	
	private String P_name;
	private int Qty;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return P_name;
	}
	public void setPname(String pname) {
		P_name = pname;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		this.Qty = qty;
	}
	
}

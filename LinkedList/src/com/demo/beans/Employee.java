package com.demo.beans;

public class Employee {
	
	private int eid;
	private String ename;
	private String add;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, String add) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.add = add;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", add=" + add + "]";
	}
	
	

}

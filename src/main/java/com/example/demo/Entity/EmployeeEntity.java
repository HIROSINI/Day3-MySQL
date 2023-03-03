package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Details")
public class EmployeeEntity 
{
	@Id
	@Column(name="Employee ID")
	private int eid;
	@Column(name="Employee Name")
	private String ename;
	@Column(name="Employee Age")
	private int eage;
	@Column(name="Employee Salary")
	private long esal;
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
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public long getEsal() {
		return esal;
	}
	public void setEsal(long esal) {
		this.esal = esal;
	}
	public EmployeeEntity(int eid, String ename, int eage, long esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.esal = esal;
	}
	public EmployeeEntity() {
		
	}
}

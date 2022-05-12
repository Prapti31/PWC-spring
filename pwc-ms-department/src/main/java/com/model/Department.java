package com.model;

public class Department {
	private String deptartmentName;
	private String managerName;
	public String getDeptartmentName() {
		return deptartmentName;
	}
	public void setDeptartmentName(String deptartmentName) {
		this.deptartmentName = deptartmentName;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public Department(String deptartmentName, String managerName) {
		super();
		this.deptartmentName = deptartmentName;
		this.managerName = managerName;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [deptartmentName=" + deptartmentName + ", managerName=" + managerName + "]";
	}
	
}

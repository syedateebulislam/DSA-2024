package org.example.design.Design_Pattern.Observer_Pattern;

public class Departments {
	private String DeptName;

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	public Departments(String deptName) {
		super();
		DeptName = deptName;
	}
}

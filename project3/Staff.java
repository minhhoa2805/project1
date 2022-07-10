package project3;

import java.util.ArrayList;

public abstract class Staff {
	//fields
	int id;
	String name;
	int age;
	//he so luong
	int heSoLuong;
	String division;
	int leave;
	String startDate = "dd/MM/yyyy";
	
	
	public Staff() {
		
	}
	//contructor
	public Staff(int id, String name, int age, int heSoLuong, String division, int leave, String startDate) {
		this.id= id;
		this.name=name;
		this.age= age;
		this.heSoLuong = heSoLuong;
		this.division = division;
		this.leave = leave;
		this.startDate = startDate;
		
	}
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public int getLeave() {
		return leave;
	}

	public void setLeave(int leave) {
		this.leave = leave;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	//behavior
	abstract void displayInformation();
	abstract void newStaffAdd();	
	

}


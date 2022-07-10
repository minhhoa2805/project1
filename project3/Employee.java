package project3;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends Staff implements ICalculator{
	private double OT;
	public Employee() {
		
	}
	public Employee(int id, String name, int age, int heSoLuong, String division, int leave, String startDate, int OT) {
		super(id, name, age, heSoLuong, division, leave, startDate);
		this.OT = OT;
	}
	



	//phuong thuc tra ve thong tin nhan vien
	@Override
	void displayInformation() {
		System.out.println(" "+getId()+"	 "+getName()+ "     " + getAge() + " 	   "+ getHeSoLuong()+"        	" + getDivision()+"       " + getLeave()+ "       " + getStartDate() + "       " + getOT());
		
	}
	
	
	public double getOT() {
		return OT;
	}


	public void setOT(double oT) {
		OT = oT;
	}

	
	@Override
	void newStaffAdd() {
		Scanner input = new Scanner(System.in);
		System.out.print("số lượng nhân viên mới thêm vào: ");
		int newQuantity = Integer.parseInt(input.nextLine());
		for(int i=1; i<=newQuantity; i++) {
			
			System.out.println("nhan vien moi " + i +" : ");
			System.out.print("Mã số nhân viên: ");
			setId(Integer.parseInt(input.nextLine()));
			System.out.print("Họ và tên: ");
			setName(input.nextLine());
			System.out.print("Tuổi: ");
			setAge(Integer.parseInt(input.nextLine()));
			System.out.print("Hệ số lương: ");
			setHeSoLuong(Integer.parseInt(input.nextLine()));
			System.out.print("Bộ phận: ");
			setDivision(input.nextLine());
			System.out.print("ngày nghỉ phép: ");
			setLeave(Integer.parseInt(input.nextLine()));
			System.out.print("Ngày vào làm: ");
			setStartDate(input.nextLine());
			
		}
	}
	//phuong thuc tra ve luong nhan vien
	@Override
	public double calculateSalary() {
		double salary = (double)getHeSoLuong()*30000000+getOT()*200000;
		return salary;
		
		
	}
		
	
}

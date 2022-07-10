package project3;

import java.util.Scanner;

public class Manager extends Staff implements ICalculator{
	String chucDanh;
	
	public Manager() {
		
	}
	public Manager(int id, String name, int age, int heSoLuong, String division, int leave, String startDate, String chucDanh) {
		super(id, name, age, heSoLuong, division, leave, startDate);
		this.chucDanh = chucDanh;
	}
	
	
	
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
			System.out.print("chuc vu: ");
			setChucDanh(input.nextLine());
			}
		}
	
	@Override
	void displayInformation() {
		System.out.println(" "+getId()+"	 "+getName()+ "	  " + getAge() + " 	   "+ getHeSoLuong()+"       	" + getDivision()+"       " + getLeave()+ "       " + getStartDate() + "       " + getChucDanh());
		
	}
	public String getChucDanh() {
		return chucDanh;
	}
	public void setChucDanh(String chucDanh) {
		this.chucDanh = chucDanh;
	}
	@Override
	public double calculateSalary() {
		int trachNhiem=0;
		if(chucDanh.equals("Business Leader")) {
			trachNhiem =8000000;
		}else if(chucDanh.equals("Project Leader")) {
			trachNhiem = 5000000;
		}else if(chucDanh.equals("Technical Leader")) {
			trachNhiem=6000000;
		}
		
		return (double)getHeSoLuong()*5000000 +trachNhiem;
		
		
	}

}

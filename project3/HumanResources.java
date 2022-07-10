package project3;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;


public class HumanResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("CHƯƠNG TRÌNH QUẢN LÍ NHÂN VIÊN:");
		System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty ");
		System.out.println("2. Hiển thị các bộ phận trong công ty ");
		System.out.println("3. Hiển thị các nhân viên theo từng bộ phận  ");
		System.out.println("4. Thêm nhân viên mới vào công ty ");
		System.out.println("5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên ");
		System.out.println("6. Hiển thị bảng lương của nhân viên toàn công ty ");
		System.out.println("7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dan");
		System.out.println("8. Hiển thị bảng lương của nhân viên theo thứ tự giam dan");

		System.out.println("0. exit");
		
		ArrayList<Staff> staffs = new ArrayList<Staff>();
		ArrayList<Department> departments = new ArrayList<Department>();
		Staff staff1 = new Manager(101,"Nguyen Van A", 30, 3, "Business", 4, "15/05/2019", "Business Leader"); 
		Staff staff2 = new Manager(102,"Nguyen Van H", 25, 3, "Technical",1, "15/05/2019", "Technical Leader"); 
		Staff staff3 = new Manager(103,"Nguyen THI D", 27, 3, "Project", 4, "15/05/2019", "Project Leader");
		Staff staff4 = new Employee(104,"Nguyen Van C",30, 1, "Business", 5,"28/09/2019", 20);
		Staff staff5 = new Employee(105,"Nguyen Van K",22, 1, "Business", 1,"02/09/2020", 15);
		Staff staff6 = new Employee(106,"Nguyen Van V",19, 1, "Project", 3,"28/03/2021", 30);
		Staff staff7 = new Employee(107,"Nguyen Van T",25, 1, "Project", 4,"08/09/2019", 20);
		Staff staff8 = new Employee(108,"Nguyen Van Q",29, 1, "Project", 2,"28/05/2020", 9);
		Staff staff9 = new Employee(109,"Nguyen Van B",32, 1, "Technical", 5,"28/05/2019", 15);
		staffs.add(staff1);
		staffs.add(staff2);
		staffs.add(staff3);
		staffs.add(staff4);
		staffs.add(staff5);
		staffs.add(staff6);
		staffs.add(staff7);
		staffs.add(staff8);
		staffs.add(staff9);
		Department d1 = new Department(101, "Business",3);
		Department d2 = new Department(102, "Project",4);
		Department d3 = new Department(103, "Technical",2);
		departments.add(d1);
		departments.add(d2);
		departments.add(d3);
		int n;
		do {
			System.out.print("chọn một chức năng muốn truy cập từ 1 đến 7: ");
			n = Integer.parseInt(input.nextLine());
			System.out.println("");
			switch(n) {
				case 1: 
					System.out.println("--------------------------------------********-------------------------------------------");
					System.out.println("danh sách nhân viên hiện có trong công ty: ");
					System.out.println("MSNV |    Ho va ten    | tuoi | he so luong |   bo phan   |nghi phep | ngay vao lam |    chu thich    |");
					for(Staff staff:staffs) {
						staff.displayInformation();
					};
				break;
				case 2:
					
					System.out.println("--------------------------------------********-------------------------------------------");
					System.out.println("CÁC BỘ PHẬN TRONG CÔNG TY: ");
					System.out.println("MÃ BỘ PHẬN    TÊN BỘ PHẬN      SỐ NV HIỆN TẠI ");
					for(Department department:departments) {
						department.toString();
						System.out.println(department);
					}
				break;
				case 3:
					System.out.println("--------------------------------------********-------------------------------------------");
					System.out.println("Danh sach nhân viên bộ phận Business: ");
					System.out.println("MSNV |    Ho va ten    | tuoi | he so luong |   bo phan   |nghi phep | ngay vao lam  ");
					
					for(Staff staff:staffs) {
						if(staff.division.equals("Business")) {
							staff.displayInformation();
						}
					}
					System.out.println("--------------------------------------********-------------------------------------------");
					System.out.println("Danh sach nhân viên bộ phận Project: ");
					System.out.println("MSNV |    Ho va ten    | tuoi | he so luong |   bo phan   |nghi phep | ngay vao lam  ");
					
					for(Staff staff:staffs) {
						if(staff.division.equals("Project")) {
							staff.displayInformation();
						}
					}
					System.out.println("--------------------------------------********-------------------------------------------");
					System.out.println("Danh sach nhân viên bộ phận Technical : ");
					System.out.println("MSNV |    Ho va ten    | tuoi | he so luong |   bo phan   |nghi phep | ngay vao lam  ");
					
					for(Staff staff:staffs) {
						if(staff.division.equals("Technical")) {
							staff.displayInformation();
						}
					}
				break;
				case 4:
					System.out.println("--------------------------------------********-------------------------------------------");
					
					System.out.print("Nhập 1 để thêm nhân viên thông thường hoặc 2  Thêm nhân viên quản lý");
					int a = Integer.parseInt(input.nextLine());
					do {
						if(a==1) {
								Staff emp = new Employee();
								emp.newStaffAdd();
								staffs.add(emp);
						}
						else if(a==2) {
							Staff newMng = new Manager();
							newMng.newStaffAdd();
							staffs.add(newMng);
							
						}
					}while(a!=1&&a!=2);
				break;
				case 5:
					System.out.print("chọn 1 để tìm theo tên hoặc 2 để tìm theo mã nhân viên  ");
					int t = Integer.parseInt(input.nextLine());
					do {
						if(t==1) {
							 System.out.print("nhap tên nhân viên tìm kiếm: ");
							 String SearchName = input.nextLine();
							 for(Staff search:staffs) {
								 if(search.getName().equals(SearchName)) {
									 System.out.println("--------------------------------------********-------------------------------------------");
									 System.out.println("MSNV |    Ho va ten    | tuoi | he so luong |   bo phan   |nghi phep | ngay vao lam  ");
									 search.displayInformation();
								 }
							 }
						}
						else if(t==2) {
							System.out.print("mã nhân viên tìm kiếm: ");
							 int SearchId = Integer.parseInt(input.nextLine());
							 for(Staff search:staffs) {
								 if(search.getId()==SearchId) {
									 System.out.println("--------------------------------------********-------------------------------------------");
									 System.out.println("MSNV |    Ho va ten    | tuoi | he so luong |   bo phan   |nghi phep | ngay vao lam  ");
									 search.displayInformation();
								 }
							 }
						}
					}while(t!=1 && t!=2);
					break;
				case 6:
					System.out.println("--------------------------------------********-------------------------------------------");
					System.out.println("bang luong nv toan cong ty: ");
					System.out.println("");
					System.out.println("MSNV |   Ho va ten  |   bo phan  |  luong  ");
					for(Staff staff:staffs) {
						double salary = ((ICalculator) staff).calculateSalary();
						Locale locale = new Locale("vi", "VN");
						NumberFormat format = NumberFormat.getInstance(locale);
						System.out.println(staff.getId()+ "     "+ staff.getName() + "    "+staff.getDivision()+"    " + format.format(salary));
						
						System.out.println("");
						
					}
					break;
				case 7:
					System.out.println("--------------------------------------********-------------------------------------------");
					System.out.println("bang luong nv toan cong ty tho thu tu tang dan: ");
					System.out.println("");
					System.out.println("MSNV |   Ho va ten  |   bo phan  |  luong  ");
						Collections.sort(staffs, new Comparator<Staff>() {
		
							@Override
							public int compare(Staff o1, Staff o2) {
								if(((ICalculator) o1).calculateSalary()>((ICalculator) o2).calculateSalary()) {
									return 1;
								}else if(((ICalculator) o1).calculateSalary()<((ICalculator) o2).calculateSalary()) {
									return -1;
								}else
								return 0;
							}
		
						});
						for(Staff newStaffs:staffs) {
							double salary = ((ICalculator)newStaffs).calculateSalary();
							Locale locale = new Locale("vi", "VN");
							NumberFormat format = NumberFormat.getInstance(locale);
							System.out.println(newStaffs.getId()+ "     "+ newStaffs.getName() + "    "+newStaffs.getDivision()+"    " + format.format(salary));
						}
					
				break;
				case 8:
					System.out.println("--------------------------------------********-------------------------------------------");
					System.out.println("bang luong nv giam dan: ");
					System.out.println("");
					System.out.println("MSNV |   Ho va ten  |   bo phan  |  luong  ");
					Collections.sort(staffs, new Comparator<Staff>() {
						
						@Override
						public int compare(Staff o1, Staff o2) {
							if(((ICalculator) o1).calculateSalary()>((ICalculator) o2).calculateSalary()) {
								return -1;
							}else if(((ICalculator) o1).calculateSalary()<((ICalculator) o2).calculateSalary()) {
								return 1;
							}else
							return 0;
						}
	
					});
					for(Staff newStaffs:staffs) {
						double salary = ((ICalculator)newStaffs).calculateSalary();
						Locale locale = new Locale("vi", "VN");
						NumberFormat format = NumberFormat.getInstance(locale);
						System.out.println(newStaffs.getId()+ "     "+ newStaffs.getName() + "    "+newStaffs.getDivision()+"    " + format.format(salary));
					}
				
			break;
			}
		
		}while(n!=0);
	}
	
}
			
		
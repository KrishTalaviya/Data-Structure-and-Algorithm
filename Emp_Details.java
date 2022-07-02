import java.util.Scanner;
class Employee_Detail{
int eId;
String eName;
String eDesignation;
double eSalary;
void printEmpDetails(int eId,String eName,String eDesignation,double eSalary){
	this.eId=eId;
	this.eName=eName;
	this.eDesignation=eDesignation;
	this.eSalary=eSalary;
	System.out.println("empId="+this.eId);
	System.out.println("empName="+this.eName);
	System.out.println("empDesignation="+this.eDesignation);
	System.out.println("empSalary="+this.eSalary);
}

}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Id=sc.nextInt();
		String name=sc.nextLine();
		double sal=sc.nextDouble();
		String Desig=sc.nextLine();
		Employee_Detail eobj=new Employee_Detail();
		eobj.printEmpDetails(Id,name,Desig,sal);
		
		
	}
}
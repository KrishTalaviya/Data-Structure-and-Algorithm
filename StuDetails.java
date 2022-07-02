import java.util.Scanner;
class Student_Details{
	int eNo;
	String sName;
	int sem;
	double cpi;
	void printStuDetails(int eNo,String sName,int sem,double cpi){
		this.eNo=eNo;
		this.sName=sName;
		this.sem=sem;
		this.cpi=cpi;
		System.out.println("enroll="+this.eNo);
		System.out.println("Stuname="+this.sName);
		System.out.println("sem="+this.sem);
		System.out.println("cpi="+this.cpi);
		
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student_Details[] sobj=new Student_Details[5];
		for(int i=0;i<5;i++){
			sobj[i]=new Student_Details();
		}
		for(int i=0;i<5;i++){
          int eNo=sc.nextInt();
          String name=sc.next();
          int sem=sc.nextInt();
          double cpi=sc.nextDouble();
          sobj[i].printStuDetails(eNo,name,sem,cpi);
		}
		
	}
}
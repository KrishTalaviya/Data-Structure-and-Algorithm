import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Swap obj=new Swap();
		obj.swapNumber(a,b);
	
	}
}
class Swap{
	int temp;
	public  void swapNumber(int a,int b)
	  {
			 temp=a;
			a=b;
			b=temp;
			System.out.println(a);
			System.out.println(b);
		}
}
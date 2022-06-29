import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
	   int n=Integer.parseInt(str);
	   
	   int a,sum=0;
	   while(sum!=1 && sum!=4){
	   	sum=0;
	   	while(n>0){
	   		a=n%10;
	   		sum=sum+(a*a);
	   		n=n/10;
	   		
	   	}
	   	n=sum;
	   	
	   	
	   	
	   	
	   }
	   if(sum==1){
	   		System.out.println("Happy number");
	   		
	   			}
	  else{
	   				System.out.print("unhappy");
	   			}
	   
	}
}
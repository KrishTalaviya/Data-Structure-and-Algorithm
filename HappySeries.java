
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int b=sc.nextInt();
	   int n;
	   
	   int a,sum=0;
	   for(int i=1;i<=b;i++){
	   	n=i;
	   	sum=0;
	   while(sum!=1 && sum!=4)
	   {
	   	
	   	sum=0;
	   	while(n>0){
	   		a=n%10;
	   		sum=sum+(a*a);
	   		n=n/10;
	   		
	   	}
	   	n=sum;
	   	  if(sum==1){
	   		System.out.println(i);
	    }
	   
   	}
	}
	}
}
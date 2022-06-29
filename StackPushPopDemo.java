import java.util.Scanner;
class StackPushPopDemo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StackPushPop obj=new StackPushPop();
		System.out.println("enter operation");
		String str=sc.nextLine();
		if(str.equals("push")){
		System.out.println("enter value to be added");
	    int n=sc.nextInt();		
		obj.push(n);
	}
	else if(str.equals("pop")){
		int x=obj.pop();
		System.out.println("data recovered="+x);
	}
	}
}
import java.util.Scanner;
class Stack{
	int size;
	int[] stack;
	int top=-1;
	Stack(int size){
		this.size=size;
		stack=new int[this.size];
	}
	void push(int x){
		if(top>=this.size-1){
			System.out.println("Stack is full");
		}
		else{
			top++;
			stack[top]=x;
			
		}
	}
	int pop(){
		if(top<=-1){
			System.out.println("Stack is empty");
			return 0;
		}
		else
		{
			return stack[top--];
		}
	}
	int peek(){
		return stack[top];
	}
	int peep(int a){
		if(a>top+1){
			System.out.println("Given element is out of range");
			return 0;
		}
		else{
			return stack[top-a+1];
		}
	}
	void change(int a,int x){
		if(a>top+1){
			System.out.println("Given element is out of range");
			
		}
		else{
			 stack[top-a+1]=x;
		}
	}
	void display(){
		for(int i=0;i<=top;i++){
			System.out.println(stack[i]);
		}
	}
	int search(int x){
		for(int i=0;i<=top;i++){
			if(stack[i]==x){
				return i;
			}
			else{
				System.out.println("element is not in stack");
				return 0;
			}
		}
		return 0;
	}
	void stackStatus(){
		if(top<=-1){
		System.out.println("Stack is empty");
		}
		else if(top>=this.size-1){
			System.out.println("Stack is full");
		}
		else{
			System.out.println("stack is unfilled");
		}
	}
	int valueOfTop(){
		return top;	
	}
	
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of stack=");
		int size=sc.nextInt();
		String str="";
		
		Stack stk=new Stack(size);
		do{
		System.out.print("enter operation= ");
		 str=sc.next();
		if(str.equals("push")){
			System.out.print("enter value to be inserted=");
			int val=sc.nextInt();
			stk.push(val);
		}
		else if(str.equals("pop")){
			int y=stk.pop();
			System.out.println("poped value="+y);
		}
		else if(str.equals("peek")){
			System.out.println("top="+stk.peek());
		}
		else if(str.equals("peep")){
			System.out.print("enter index to be readed=");
			int pe=sc.nextInt();
			System.out.println("value at a="+stk.peep(pe));
			}
			else if(str.equals("change")){
				System.out.print("enter index to be changed");
				int pe=sc.nextInt();
				System.out.print("enter number to be changed");
				
				int x=sc.nextInt();
			stk.change(pe,x);
		}
		else if(str.equals("search")){
			System.out.print("enter number to be searched=");
			int s=sc.nextInt();
			System.out.println("index="+stk.search(s));
		}
		else {
			stk.stackStatus();
			System.out.println("top="+stk.valueOfTop());
		}
		}
		while(!str.equals("break"));
		
			stk.display();
		
				
		
		
		
	}
}
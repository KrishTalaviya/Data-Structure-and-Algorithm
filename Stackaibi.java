import java.util.Scanner;
class Stack{
	int top=-1;
	char stack[];
	int size;

	Stack(int size){
		this.size=size;
		 stack=new char[this.size];

	}
	void push(char x){
		if(top>=this.size){
			System.out.println("stack is full");

		}
		
		else{
			top++;
            stack[top]=x;
	     }

	}
	char pop(){
		if(top<=-1){
			System.out.println("stack is full");
			return 0;
		}
		else{
		return stack[top--];
	   }
	}
}
class Stackaibi{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int size=str.length();
		int count=0;
		int ca=0,cb=0;
		char temp;
		Stack stk=new Stack(size);
		for(int i=0;i<size;i++){
			if(str.charAt(i)=='a' || str.charAt(i)=='b'){
				temp=str.charAt(i);
				stk.push(temp);
			}
			else{
				
				count=1;
				break;
			}

		}
		if(count==0){
			for(int i=stk.top;i>=0;i--){
				if(stk.pop()=='a'){
					ca++;
				}
				else{
					cb++;
				}
			}
			if(ca==cb){
				System.out.println("valid string");
			}
			else{
				System.out.println("invalid string");
			}
		}
		else{
			System.out.println("invalid string");
		}

	}
}

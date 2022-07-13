import java.util.Scanner;
class Stack{
	char[] stack;
	int size;
	int top=-1;
	Stack(int size){
		this.size=size;
		stack=new char[this.size];
	}
	void push(char x){
		if(top>=size){
			System.out.println("stack is full");
        }
        else{
        	top++;
        	stack[top]=x;
        }

	}
	char pop(){
		if(top<=-1){
			System.out.println("stack is empty");
			return '0';
		}
		else{
			return stack[top--];
			
		}
	}
	char peek(){
		return stack[top];
	}
	boolean isEmpty(){
		if(top<=-1){
			return true;
		}
		else{
			return false;
		}
	}

}
class Postfix{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int size=str.length()-1;
		Stack stk=new Stack(size);
		char c;
		String postfix="";
		for(int i=0;i<=size;i++){
			c=str.charAt(i);
			if(c>='a' && c<='z'){
				postfix+=c;
			}
			else if(c=='('){
				stk.push(c);
			}
			else if(c==')'){
				while(!stk.isEmpty() && stk.peek()!='('){
					postfix+=stk.pop();
                }
                stk.pop();

			}
			else{
				while(!stk.isEmpty() && (pre(c)<=pre(stk.peek()))){
					postfix+=stk.pop();

				}
				stk.push(c);
			}
		}
		while(!stk.isEmpty()){
			if(stk.peek()=='('){
				
			}
			else{
				postfix+=stk.pop();
			   }
			}
			System.out.println(postfix);

		}
		static int pre(char op){
			switch(op)
			{
			case '/':
				return 4;
				
			case '*':
				return 3;
				
			case '+':
				return 2;
				
			case '-':
				return 1;
				
			default :
				return 0;

			}
		}
	}

class StackPushPop{
	
	
	int[] arr=new int[10];
	int top=-1;
	 public void push(int a){
	 	if(top>=10){
	 		System.out.println("stack is full");
	 	}
	 	else{
	 		top++;
	 		arr[top]=a;
	 		System.out.println("data added succesfully");
	 	}
	 }
	 public int pop(){
	 	if(top==-1){
	 		System.out.println("stack is empty");
	 		return 0;
	 	}
	 	else{
           /* int d=top;
            top--
	 		return arr[d];*/
	 		return arr[top--];

	 	}

	 }
}
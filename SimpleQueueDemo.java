import java.util.Scanner;
class SimpleQueue{
	int[] queue;
	int front=-1;
	int rear=-1;
	int y,size;
	SimpleQueue(int size){
		this.size=size;
		queue=new int[this.size];
    }
    void enqueue(int value){
    	if(rear>=size){
    		System.out.println("Queue is full");
    	}
    	else{
    		if(rear==-1){
    			rear=0;
    		}
    		queue[rear]=value;
    		rear++;
    		
    		if(front==-1){
    			front=0;
    		}
    	}

    }
    int dequeue(){
    	if(front>rear || front<=-1){
    		System.out.println("Queue is empty");
    		return 0;
    	}
    	else{
    		y=queue[front];
    		if(front==rear){
    			front=-1;
    			rear=-1;
    		}
    		else{
    			front++;
    		}
    		return y;
    	}
    }
    void display(){
    	for(int i=front;i<=rear;i++){
    		System.out.println(queue[i]);
    	}
    }
}
class SimpleQueueDemo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of queue");
		int size=sc.nextInt();
		SimpleQueue sq=new SimpleQueue(size);
		sq.enqueue(5);
		sq.display();


	}

}
import java.util.Scanner;
class CircularQueue{
	int[] circularqueue;
	int front=-1;
	int rear=-1;
	int size;
	int y;
	CircularQueue(int size){
		this.size=size;
		circularqueue=new int[this.size];
    }
    void cqEnqueue(int value){
    	if(rear>=size && front==0){
    		System.out.println("circularqueue is full");
    	}
    	else{
    		if(rear==size-1){
    			rear=0;
    		}
    		circularqueue[rear]=value;
    		rear++;
    	}
    }
    int cqDequeue(){
    	if(front<=-1){
    		System.out.println("circularqueue is empty");
    		return 0;
    	}
    	else if(rear>=size && front==0){
    		y=circularqueue[rear];
    		front++;
    		rear=0;
    		return y;
    	}
    	else{
    		y=circularqueue[front];
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
    	for(int i=front;i<size;i++){
    		System.out.println(circularqueue[i]);
    	}
    	for(int i=0;i<rear;i++){
    		System.out.println(circularqueue[i]);

    	}
    }
}
class CircularQueueDemo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of queue");
		int size=sc.nextInt();
		CircularQueue cq=new CircularQueue(size);
		cq.cqEnqueue(5);
		cq.display();


	}

}
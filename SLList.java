class Sll{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	void addFirst(int d){
         Node newNode=new Node(d);
         if(head==null){
         	newNode.next=head;
         	head=newNode;
         }
         else{
         	newNode.next=head;
         	head=newNode;
         }
	}
	void addLast(int d){
		Node newNode=new Node(d);
		if(head==null){
			newNode.next=head;
         	head=newNode;
		}
		else{
			Node currentNode=head;
			while(currentNode.next!=null){
				currentNode=currentNode.next;
			}
			currentNode.next=newNode;
		}
	}
	void addPosition(int x,int d){
		Node newNode=new Node(d);
		if(head==null){
			newNode.next=head;
         	head=newNode;
		}
		else{
			Node currentNode=head;
		 for(int i=0;i<x-1;i++){
			currentNode=currentNode.next;
		}
		newNode.next=currentNode.next;
		currentNode.next=newNode;
	    }
	}
	int removeFirst(){
		if(head==null){
			System.out.println("list is empty");
			return 0;
		}
		else{
			int temp=head.data;
			head=head.next;
			return temp;
		}
	}
	int removeLast(){
       if(head==null){
			System.out.println("list is empty");
			return 0;
		}
		else{
		   Node currentNode=head;
			while(currentNode.next!=null){
				currentNode=currentNode.next;
			}
			int temp=currentNode.next.data;
			currentNode.next=null;
			return temp;	
		}
	}
	int removePosition(int x){
		if(head==null){
			System.out.println("list is empty");
			return 0;
		}
		else{
           Node currentNode=head;
           Node prevNode=null;
		   for(int i=0;i<x;i++){
		 	prevNode=currentNode;
			currentNode=currentNode.next;
		  }
		  prevNode.next=currentNode.next;
		  return currentNode.data;

		}
	}
	int sizeOfList(){
		int count=0;
		if(head==null){
			return 0;
		}
		else{
			Node currentNode=head;
			while(currentNode!=null){
				count++;
				currentNode=currentNode.next;
			}
		   return count;	
		}
		
	}
	void display(){
		Node currentNode=head;
			while(currentNode!=null){
				System.out.println(currentNode.data);
				currentNode=currentNode.next;
			}
		}
	
}

class SLList{
	public static void main(String[] args) {
		Sll list=new Sll();
		list.addLast(5);
		list.addLast(10);
		list.display();
	}
}
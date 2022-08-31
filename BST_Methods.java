import java.util.Stack;
class Bst{
	Node root;
	class Node{
		Node right;
	    Node left;
	    int data;
		Node(int data){
       		this.data=data;
       		right=null;
       		left=null;
		}
	}
   void insert_bst(int d){
   		Node newNode=new Node(d);
       	if(root==null){
       		 root=newNode;
       	}
       	else{
       		Node temp=root;
       		while(temp.right!=null || temp.left!=null){
           		if(newNode.data>=temp.data && temp.right!=null){
                	temp=temp.right;
           		}
           		else if(newNode.data<temp.data && temp.left!=null){
                	temp=temp.left;
           		}
           		else{
           			break;
           		}
           	}
           	if(newNode.data>=temp.data){
       			temp.right=newNode;
       		}
       		else{
       			temp.left=newNode;
       		}
       	}
   }
   void inOrderTraversal(){
   	   Node temp=root;
   	   Stack<Node> stk=new Stack<Node>();
   	   while(temp!=null ||stk.size()>0){
   	   		while(temp!=null){
   	   			stk.push(temp);
   	   			temp=temp.left;
   	   		}
            temp=stk.pop();
            System.out.println(temp.data);
            temp=temp.right;
   	   }
   }
   void preOrderDisplay(){
   	if(root==null){
   		System.out.println("BST IS EMPTY");
   	}
   	else{
   		Stack<Node> stk2=new Stack<Node>();
   		
   		stk2.push(root);
   		while(!stk2.empty()){
   			Node demo=stk2.pop();
   			System.out.println(demo.data);
   			if(demo.right!=null){
   				stk2.push(demo.right);
   			}
   			if(demo.left!=null){
   				stk2.push(demo.left);
   			}


   		}
   	}
   }
}
class BST_Methods{
	public static void main(String[] args) {
		Bst bstree=new Bst();
		bstree.insert_bst(8);
		bstree.insert_bst(10);
		bstree.insert_bst(7);
		bstree.insert_bst(9);
		//bstree.preOrderDisplay();
		bstree.inOrderTraversal();
		bstree.preOrderDisplay();
		
		
		
}
}
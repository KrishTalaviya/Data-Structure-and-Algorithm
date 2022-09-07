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
   void delete_leafNode(int a){
   	Node parent=null;
   	Node temp=root;
   	Node t;
   	while(temp!=null && temp.data!=a){
   		parent=temp;
   		if(a>temp.data){
   			temp=temp.right;
   		}
   		else{
   		  temp=temp.left;
   		}
   		
   	}
   	if(temp.left==null && temp.right==null){
   		if(temp.data>parent.data){
           parent.right=null;
   		}
   		else{
   			parent.left=null;
   		}
   	}
   	if(temp.left!=null && temp.right==null){
          parent.left=temp.left;
   	}
   	if(temp.left==null && temp.right!=null){
         parent.right=temp.right;
   	}
   	if(temp.left!=null && temp.right!=null){

         t=inOrderSuccesor(temp);
         temp.data=t.data;
     }
  }
   Node inOrderSuccesor(Node temp){
      boolean rightchild=true;
      Node parent=temp;
      temp=temp.right;
      if(temp.left!=null){
      	rightchild=false;
      }
      while(temp.left!=null){
       parent=temp;
       temp=temp.left;

      }
      if(rightchild){
      	parent.right=temp.right;
      }
      else{
      	parent.left=temp.left;
      }
      return temp;
   }

}
class BST_Methods{
	public static void main(String[] args) {
		Bst bstree=new Bst();
		bstree.insert_bst(5);
		bstree.insert_bst(3);
		bstree.insert_bst(8);
		bstree.insert_bst(1);
		bstree.insert_bst(10);
		bstree.insert_bst(9);
		bstree.insert_bst(100);
		bstree.preOrderDisplay();
		
		bstree.delete_leafNode(10);
		System.out.println("----");
		bstree.preOrderDisplay();
		
		
		
		
}
}

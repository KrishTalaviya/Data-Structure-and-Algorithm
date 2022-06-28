public class Main {
	public static void main(String[] args) {
		int[] a={7,7,7,5,5,5,9,9,9};
		int count=0;
		int flag=0;
		int i=0;
		for(i=0;i<9;i++){
		if(i+1<9){
			if(a[i+1]-a[i]==0){
				count++;
				}
		   else if(count>=2 && a[i+1]>a[i]){
		   	count++;
		   	continue;
		   }
		   else{
		   	flag=1;
		   }
		}
		}
		if(count==8){
			System.out.println("1");
		}
		else{
			System.out.print("0");
		}
	}
}
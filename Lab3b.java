class Lab3a{
	public static void main(String[] args) {
		int[] arr={9,8,9};
		int max=arr[0];
		int max2=arr[0];
		for(int i=0;i<3;i++){
			if(i==0){
				max=arr[0];
				max2=Integer.MIN_VALUE;
			}
			else if(max<arr[i]){
				max2=max;
				max=arr[i];
			}
			else if(max2<arr[i]){
				max2=arr[i];
			}
		}
		System.out.println(max2);
	}
}
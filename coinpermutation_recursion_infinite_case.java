public static void main(String args[]) {
		
		int arr[]={2,3,5};
		int target=10;
		print(arr, 0, target, "");
	}
	public static void print(int arr[],int sum,int target,String ans){
		
			if(sum==target){
				System.out.print(ans+" ");
				return;
			}
		
		if(sum>target){
			return;
		}
		for(int i=0;i<arr.length;i++){
			print(arr, sum+arr[i], target, ans+arr[i]);
		}
	}

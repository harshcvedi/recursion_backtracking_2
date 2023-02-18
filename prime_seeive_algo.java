public static void main(String args[]) {
		int n=100;
		
		primeseive(n);

	}
	public static void primeseive(int n){
		boolean arr[]=new boolean[n+1];
		arr[0]=arr[1]=true;
		for(int i=2;i*i<arr.length;i++){
			if(arr[i]==false){
				for(int k=2;k*i<arr.length;k++){
					arr[i*k]=true;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
				if(arr[i]==false){
					System.out.print(i+" ");
				}
		}


	}
}

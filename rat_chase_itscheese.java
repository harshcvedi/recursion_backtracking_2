public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int n=5;
		int m=4;
		char [][]arr=new char[5][4];
		for(int i=0;i<5;i++){
			String s=sc.next();
			for(int j=0;j<s.length();j++){
				arr[i][j]=s.charAt(j);
			}
		}

		int brr[][]=new int[5][4];
		print(arr, brr, 0, 0, n, m);
		if(flag==false){
			System.out.println("-1");
		}
	}
	 static boolean flag=false;

	public static void print(char [][]arr,int brr[][],int cr,int cc,int n,int m){
		if(cr==n-1 && cc==m-1 && arr[cr][cc]!='X'){
			brr[cr][cc]=1;
			flag=true;
			display(brr);
			return;
		}
		if(cr<0 || cc<0 ||cr>=n ||cc>=m ||arr[cr][cc]=='X'){
			return ;
		}
		arr[cr][cc]='X';
		brr[cr][cc]=1;
		int r[]={0,0,-1,1};
		int c[]={-1,1,0,0};
		for(int i=0;i<r.length;i++){
			print(arr, brr, cr+r[i], cc+c[i], n, m);
			
		}
		arr[cr][cc]='O';
		brr[cr][cc]=0;

	}
	public static void display(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
	

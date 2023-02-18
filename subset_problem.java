 public static void main(String args[]) {
        // Your Code Here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println("\n"+print(arr,m,0,0,""));

    }
    public static int print(int []arr,int m,int i,int sum,String ans){
            if(i==arr.length){
                if(sum==m){
                    System.out.print(ans+" ");
                    return 1;
                }
                return 0;
            }
            int a=print(arr,m,i+1,sum+arr[i],ans+arr[i]+" ");
            int b=print(arr,m,i+1,sum,ans);
            return a+b;
        

    } 

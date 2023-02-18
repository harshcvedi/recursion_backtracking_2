public static void main(String args[]) {
        // Your Code Here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int j=n;








        if(j%2==0){
            j=n-1;
        }
        printodd(n,j);







        printeven(n,2);
    }

    public static void printodd(int n,int j){
        
        if(j<1){
            return;








        }
        if(j>=1){






          System.out.println(j);







            j=j-2;
            printodd(n,j);
            
        }

    }
     public static void printeven(int n,int i){
       
        if(i>n){







            return;
        }
        if(i<=n){
          System.out.println(i);
            i=i+2;






            printeven(n,i);
            
        }

    }
}

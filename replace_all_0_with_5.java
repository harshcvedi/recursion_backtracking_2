public static void main (String args[]) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
      
        
          System.out.println(print(n));

    }
    public static int print(int n){
        if(n==0){
            return 5;
        }
        else {
        int temp = 0;
        while (n>0) {
            int ld = n%10;
           
           
            if (ld==0)
                ld=5;
 
            temp = temp * 10 + ld;
            n=n/10;
        }
        return reverseNumber(temp);
        }
    }
    public static int reverseNumber(int temp){

    int a = 0;
    while (temp > 0) {




        int r = temp % 10;
        a=a*10+r;
       temp=temp/10;
    }

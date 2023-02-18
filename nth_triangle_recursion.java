public static void main(String args[]) {
        // Your Code Here
        Scanner scann =new Scanner(System.in);
        int number=scann.nextInt();
        int b=nthtriangle(number);
        System.out.println(b);
       
    }

    public static int nthtriangle(int no){


        if(no==0){
            return 0;


        }
        int a=nthtriangle(no-1);

        return a+no;
    }

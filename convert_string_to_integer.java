 public static void main(String args[]) {
        // Your Code Here
        Scanner scann =new Scanner(System.in);
        String str22=scann.nextLine();





        System.out.println(convertor(str22,0,0));









    }



    public static int convertor(String str,int number,int ith){









































        if(ith==str.length()){














            return number;
        }
        number=convertor(str,number*10+(str.charAt(ith)-'0'),ith+1);







        return number;

    }
}

 public static void main(String args[]) {
        // Your Code Here
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        System.out.println(printtwins(str));
    }
     
    public static int printtwins(String str){
        if(str.length()<3){
            return 0;
        }
        int counterrrrr=0;
        if(str.charAt(0)==str.charAt(2)){
            counterrrrr++;
        }
        counterrrrr=counterrrrr+printtwins(str.substring(1));
        return counterrrrr;

     
    }

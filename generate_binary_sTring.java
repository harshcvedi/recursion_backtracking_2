public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            String str=sc.next();
            print(str,"");
            System.out.println();
        }

    }
    public static void print(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch =str.charAt(0);
        if(ch=='?'){
            print(str.substring(1),ans+"0");
            print(str.substring(1),ans+"1");

        }else{
            print(str.substring(1),ans+ch);
        }
        
    }
}

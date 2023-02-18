    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner (System.in);
        String str= sc.next();
        count(str,"",0);
        System.out.println(counter);
        replace(str,"",0);
        add(str,"",0);
    }
    static int counter=0;
     public static void count(String str,String ans,int i){
        if(str.length()<1){
            return;
         }
        if(i==str.length()){
            return ;
        }
        if(str.charAt(i)=='h' && i!=str.length()-1 ){
            if(str.charAt(i+1)=='i'){
                counter++;
                count(str,ans,i+2);
            }
            else{
                count(str,ans+str.charAt(i),i+1);
            }

        }
        else
        count(str,ans+str.charAt(i),i+1);

    }
    public static void replace(String str,String ans,int i){
        if(str.length()<1){
            return;
}
        if(i==str.length()){
            System.out.println(ans+" ");
            return ;
        }
        if(str.charAt(i)=='h'&&  i!=str.length()-1){
            if(str.charAt(i+1)=='i'){
                
                replace(str,ans,i+2);
            }
            else{
                replace(str,ans+str.charAt(i),i+1);
            }

        }
        else
        replace(str,ans+str.charAt(i),i+1);

    }
    public static void add(String str,String ans,int i){
        if(str.length()<1){
            return;
        }
        if(i==str.length()){
            System.out.println(ans+" ");
            return ;
        }
        if(str.charAt(i)=='h'&&i!=str.length()-1){
            if(str.charAt(i+1)=='i'){
                 add(str,ans+"bye",i+2);





            }
            else

{



            add(str,ans+str.charAt(i),i+1);
}







        }





        else




        {
        add(str,ans+str.charAt(i),i+1);




        }
        
    }
}

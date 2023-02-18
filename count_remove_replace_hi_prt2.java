    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner (System.in);
        String str= sc.next();
        
        counthi(str);
        System.out.println(c1);
       String str1= count(str);



       System.out.println(str1);




        String str2= coun(str);
          System.out.println(str2);
      

    }
    static int c1=0;
     public static void counthi(String str){
         if(str.length()==0){
             return;
         }
        
        if(str.length()>=3 && str.charAt(0)=='h' &&str.charAt(1)=='i' && str.charAt(2)!='t'){
            c1++;
        }else if(str.length()==2 && str.charAt(0)=='h' &&str.charAt(1)=='i' ){
             c1++;
        }

        counthi(str.substring(1));
        

    }
    public static String count(String str){
         if(str.length()==0){
             return str;
         }
        
        if(str.length()>=3 && str.charAt(0)=='h' &&str.charAt(1)=='i' && str.charAt(2)!='t'){
            String str1=count(str.substring(2));
            return str1;
        }else if(str.length()==2 && str.charAt(0)=='h' &&str.charAt(1)=='i' ){
             String str1=count(str.substring(2));
             return str1;
        }
        String str1=str.charAt(0)+count(str.substring(1));
        return str1;
        

    }








    public static String coun(String str){







         if(str.length()==0){








             return str;





         }
        
        if(str.length()>=3 && str.charAt(0)=='h' &&str.charAt(1)=='i'
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         && str.charAt(2)!='t'){
            String str1="bye"+coun(str.substring(2));







            return str1;
        }else if(str.length()==2 && str.charAt(0)=='h' 
        
        
        
        
        
        
        
        
        
        &&str.charAt(1)=='i' ){










             String str1="bye"+coun(str.substring(2));







             return str1;
        }

        String str1=str.charAt(0)+coun(str.substring(1));







        return str1;
        

    }
    
}




   

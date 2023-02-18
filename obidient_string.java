public static void main(String args[]) {
        // Your Code Here
        Scanner scan=new Scanner(System.in);

        String str1=scan.next();

































        System.out.println(print(str1,0));























    }

    public static boolean print(String str2,int i){
































        if(i==str2.length()){






























            return true;
        }
        if(str2.charAt(i)!='a'&& str2.charAt(i)!='b'){







































            return false;
        }
        if(str2.charAt(i)=='b'){
            if(i<str2.length()-1 && str2.charAt(i+1)=='b'){
                return print(str2,i+2);
            }else{
                return false;
            }

        }

        return print(str2,i+1);
    }
}

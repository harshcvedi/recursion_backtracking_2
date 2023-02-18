
    
    public static void main(String args[]) {





















        
        // Your Code Here
        Scanner scannn =new Scanner(System.in);






        String str=scannn.nextLine();











        mappedSTRing(str,"");










    }







    static String[] arr={"","A","B","C","D","E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
			"R", "S", "T", "U", "V", "W", "X", "Y", "Z" };












    public static void mappedSTRing(String s,String ans){
        if(s.length()==0){








            System.out.println(ans);











            return;
        }

        char ch =s.charAt(0);






        String press=arr[ch-'0'];






        mappedSTRing(s.substring(1),ans+press);







        if(s.length()>=2){









            String s236=s.substring(0,2);









            int number=Integer.parseInt(s236);







            if(number<=26){


























                mappedSTRing(s.substring(2),ans+arr[number]);














            }







        }





    }
}

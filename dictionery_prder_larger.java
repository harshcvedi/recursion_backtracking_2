    public static void main(String args[]) {
        // Your Code Here
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        
        ArrayList<String> list = new ArrayList<>();
        printpermutation(str,"",str,list);
        Collections.sort(list);



        for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

    }
    public static void printpermutation(String str,String ans,String str1,ArrayList<String> list){
        if(str.length()==0){
            if(ans.compareTo(str1)>0){

            //System.out.print(ans+" ");
            list.add(ans);
            return;
        }
        }
        for(int i=0;i<str.length();i++){
            String s1=str.substring(0,i);
            String s2=str.substring(i+1);
            char ch =str.charAt(i);
            printpermutation(s1+s2,ans+ch,str1,list);
        }
    }
}

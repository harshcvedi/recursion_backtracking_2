public static void main(String args[]) {
		
		String str="nitin";
		List<String> list=new ArrayList<>();
		List<List<String>> ans=new ArrayList<>();
		print(str, list, ans);
		System.out.println(ans);
	}
	public static List<List<String>> print(String str,List<String> list,List<List<String>> ans){
		if(str.length()==0){
			ans.add(new ArrayList<>(list));
			return ans;
		}

		for(int i=1;i<=str.length();i++){
			String part=str.substring(0,i);
			if(ispalindrome(part)){
				list.add(part);
			
			print(str.substring(i), list, ans);
			list.remove(list.size()-1);
		}
		
	}
	return ans;
}
	public static boolean ispalindrome(String s){
		int n=s.length();
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(n-i-1)){
				return false;
			}
		}
		return true;
	}

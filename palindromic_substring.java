for(int axis=0;axis<s.length();axis++){//odd length ke palindrome
			for(int orbit=0;axis-orbit >=0 && axis+orbit<s.length();orbit++){
				if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)){
					break;
				}
				count++;
			}
		}

		for(double axis=0.5;axis<s.length();axis++){//odd length ke palindrome
			for(double orbit=0.5;axis-orbit >=0 && axis+orbit<s.length();orbit++){
				if(s.charAt((int) (axis-orbit))!=s.charAt((int)(axis+orbit))){
					break;
				}
				count++;
			}
		}
        return count;

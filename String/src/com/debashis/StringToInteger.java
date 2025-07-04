package com.debashis;

public class StringToInteger {
	
	public static void main(String[] args) {
		
		String s="3654C34";
		System.out.println(myAtoi(s));
		
	}
	
	public static int myAtoi(String s) {
		int INT_MAX = 2147483647, INT_MIN = -2147483648;
		int result=0;
		int i=0;
		int n=s.length();
		int sign=1;
		//step 1 : skip leading whitespace
		while(i<n && s.charAt(i)==' ')
			i++;
		
		//Step 2: check optional sign
		if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')) {
			sign=s.charAt(i)=='-' ? -1 : 1;
			i++;
		}
		
		//Step 3 : convert digit into number
		while(i<n && Character.isDigit(s.charAt(i))) {
			int digit=s.charAt(i)-'0';
			if(result>(INT_MAX-digit)/10) {
				return sign==1 ? INT_MAX : INT_MIN;
			}
			result=result*10+digit;
			i++;
		}
		return result*sign;
	}

}

package com.debashis;

public class LongestPalindrome {
	
	public static void main(String[] args) {
		System.out.println(longestPalindrome("cbbd"));
		
	}
	
	public static String longestPalindrome(String s) {
		if(s==null || s.length()<1) {
			return "";
		}
		
		int start=0;
		int end=0;
		for(int i=0;i<s.length();i++) {
			int len1=expandAroundCenter(s,i,i);
			int len2=expandAroundCenter(s, i, i+1);
			int len=Math.max(len1, len2);
			if(len>(end-start+1)) {
				start=i-(len-1)/2;
				end=i+len/2;
			}
		}
		return s.substring(start,end+1);
	}

	private static int expandAroundCenter(String s, int left, int right) {
		int R=right;
		int L=left;
		while(L>=0 && R<s.length() && s.charAt(L)==s.charAt(R)) {
			L--;
			R++;
		}
		return R-L-1;
	}

}

package com.debashis;

public class LongestSubstringWithoutRepetation {

  public static void main(String[] args) {
	String s="abcabcbb";
	int n=s.length();
	int maxLength=0;
	int[] lastIndex=new int[128];
	for(int start=0,end=0;end<n;end++) {
		int currentChar=s.charAt(end);
		start=Math.max(start, lastIndex[currentChar]);
		maxLength=Math.max(maxLength, end-start+1);
		lastIndex[currentChar]=end+1;
	}
	System.out.println(maxLength);
  }
}

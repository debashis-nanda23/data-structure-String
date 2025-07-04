package com.debashis;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
	
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 3));
		
	}
	
	public static String convert(String s,int numRows) {
		if(numRows==1) {
			return s;
		}
		
		List<StringBuilder> rows=new ArrayList<>();
		for(int i=0;i<numRows;i++) {
			rows.add(new StringBuilder());
		}
		
		int currentRow=0;
		boolean goingDown=false;
		
		for(char c:s.toCharArray()) {
			rows.get(currentRow).append(c);
			if(currentRow==0 || currentRow==numRows-1) {
				goingDown=!goingDown;
			}
			currentRow+=goingDown ? 1 :-1;
		}
		
		StringBuilder sb=new StringBuilder();
		for(StringBuilder row:rows) {
			sb.append(row);
		}
		
		return sb.toString();
	}

}

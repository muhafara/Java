package com.servlet;


import java.util.ArrayList;
import java.util.StringTokenizer;

public class SearchToken {

	
	static String CharRemoval; 
	
	public void ReadDocument()
	{
		
			ArrayList<String> s= SearchStemming.tokenization;
		    CharRemoval=s.toString();
			CharRemoval=CharRemoval.replaceAll("[-',.():?!+*\\~{}@#$%^&=;]", "");
			//System.out.println("This is value of char removal"+CharRemoval);
			 //System.out.print(s);
			
			StringTokenizer tokenizer=new StringTokenizer(CharRemoval, "\n ");
			while (tokenizer.hasMoreElements()) {
			System.out.println(tokenizer.nextElement());
			}
			
	}
}



package com.servlet;


import java.util.ArrayList;
import java.util.StringTokenizer;

public class Tokenization {
	
	static String CharRemoval; 
	
	public void ReadDocument()
	{
		
			ArrayList<String> s= Stemming.tokenization;
		    CharRemoval=s.toString();
			CharRemoval=CharRemoval.replaceAll("[-',.():?!+*\\~{}@#$%^&=;]", "");
			
			
			StringTokenizer tokenizer=new StringTokenizer(CharRemoval, "\n ");
			while (tokenizer.hasMoreElements()) {
			System.out.println(tokenizer.nextElement());
			}
	}
}

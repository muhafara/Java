package com.servlet;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class DocumentToken {
	
	static String CharRemoval; 
	
	public void ReadDocument()
	{
		
		ArrayList<String> s= DocumenStemming.tokenization;
	    CharRemoval=s.toString();
		CharRemoval=CharRemoval.replaceAll("[-',.():?!+*\\~{}@#$%^&=;]", "");
		
		
		StringTokenizer tokenizer=new StringTokenizer(CharRemoval, "\n ");
		while (tokenizer.hasMoreElements()) {
		System.out.println(tokenizer.nextElement());
		
		}
	}
}



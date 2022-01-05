package com.servlet;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class FolderToken {
	
	static String CharRemoval1; 
	
	public void ReadDocument()
	{
		
		System.out.println("Got Token");
		
		ArrayList<String> s= FolderStemming.tokenization;
	    CharRemoval1=s.toString();
		CharRemoval1=CharRemoval1.replaceAll("[-',.():?!+*\\~{}@#$%^&=;]", "");
		
		
		StringTokenizer tokenizer=new StringTokenizer(CharRemoval1, "\n ");
		while (tokenizer.hasMoreElements()) {
		System.out.println(tokenizer.nextElement());
		
		}
		
		 
	}
}


package com.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.poi.ss.formula.ptg.EqualPtg;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public final class Folder {


	  /**
	  * Demonstrate use.
	  * 
	  * @param aArgs - <tt>aArgs[0]</tt> is the full name of an existing 
	  * directory that can be read.
	  */
	
	DocumentToken Dtoken=new DocumentToken();
	String UploadDocument=Dtoken.CharRemoval;
	
	  public static void main(String [] Args) throws FileNotFoundException {
	    File startingDirectory= new File("C:\\Users\\Public\\FinalProject1812-1858\\WebContent\\categories");
	    Folder listing = new Folder();
	    List<File> files = listing.getFileListing(startingDirectory);

	    //print out all file names, in the the order of File.compareTo()
	    for(File file : files)
	    {
	    	if(file.getName().toLowerCase().endsWith(".doc") || (file.getName().toLowerCase().endsWith(".docx")))
	    	{
	    		try 
	    		{
	    			XWPFDocument doc=new XWPFDocument(new FileInputStream(file));
					XWPFWordExtractor extractror=new XWPFWordExtractor(doc);
					String GetDocument=(extractror.getText());
		    		System.out.println(GetDocument +"New Document\n");
		    		
		    		FolderStopWord fd = new FolderStopWord();
		    		
		    		fd.StopwordRemoval(GetDocument);
		    		
		    		
					
				} catch (Exception e) {
					// TODO: handle exception
				}
	    
	    	}
	    }
	    
	}
	  
	  
	  
	  
	  /**
	  * Recursively walk a directory tree and return a List of all
	  * Files found; the List is sorted using File.compareTo().
	  *
	  * @param aStartingDir is a valid directory, which can be read.
	  */
	  public List<File> getFileListing(File aStartingDir) throws FileNotFoundException {
	    validateDirectory(aStartingDir);
	    List<File> result = getFileListingNoSort(aStartingDir);
	    Collections.sort(result);
	    return result;
	  }

	  // PRIVATE

	  private List<File> getFileListingNoSort(File aStartingDir) throws FileNotFoundException {
	    List<File> result = new ArrayList<>();
	    File[] filesAndDirs = aStartingDir.listFiles();
	    List<File> filesDirs = Arrays.asList(filesAndDirs);
	    for(File file : filesDirs) {
	      result.add(file); //always add, even if directory
	      if (! file.isFile()) {
	        //must be a directory
	        //recursive call!
	        List<File> deeperList = getFileListingNoSort(file);
	        result.addAll(deeperList);
	      }
	    }
	    return result;
	  }

	  /**
	  * Directory is valid if it exists, does not represent a file, and can be read.
	  */
	  private void validateDirectory (
	    File aDirectory
	  ) throws FileNotFoundException {
	    if (aDirectory == null) {
	      throw new IllegalArgumentException("Directory should not be null.");
	    }
	    if (!aDirectory.exists()) {
	      throw new FileNotFoundException("Directory does not exist: " + aDirectory);
	    }
	    if (!aDirectory.isDirectory()) {
	      throw new IllegalArgumentException("Is not a directory: " + aDirectory);
	    }
	    if (!aDirectory.canRead()) {
	      throw new IllegalArgumentException("Directory cannot be read: " + aDirectory);
	    }
	  }
	} 


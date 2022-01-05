package com.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class SearchSimilarity{
	public static ArrayList<String> getSimilarDocument=new ArrayList<String>();
	public static HashMap<String,Double> map = new HashMap<String,Double>();
    public static ComparatorValue bvc =  new ComparatorValue(map);
    public static TreeMap<String,Double> sorted_map = new TreeMap<String,Double>(bvc);
    
    String DocumentPath;
    Double GetCompareDocumentSimilarity;
    public Double sim_score;
	public static String getValue;
	String d1;
	String d2;
	
	SearchToken Stoken=new SearchToken();
	
	String UploadDocument=Stoken.CharRemoval;

	public void FolderSimilarity() throws FileNotFoundException{
		
		//System.out.println("Document Uploaded  "+ UploadDocument+"\n****");
		
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
		    		System.out.println("New Document\n");
		    		
					d1 = UploadDocument;
					
					d2 = GetDocument;
					
					
					
					 
			 FolderStopWord docstop = new FolderStopWord();
			
			 docstop.StopwordRemoval(d2);
			 
			 
			
			
		
			 FolderStemming doc_stem = new FolderStemming();
		 
		     doc_stem.Dostemming();
		    
		
		 
	
		
		 FolderToken doctoken = new FolderToken();
		 
		doctoken.ReadDocument();
		
		String d3= doctoken.CharRemoval1;
		 
		
					
					SimilarityMeasure sim_measure = new SimilarityMeasure();
					
					System.out.println("[Word # VectorA # VectorB]");
					
					sim_score = sim_measure.Cosine_Similarity_Score(d1, d3);
					
					System.out.println("Cosine similarity score = "+sim_score);
					
					DocumentPath=file.getPath();
			  		GetCompareDocumentSimilarity=sim_score;
			  		System.out.println("This is check 123"+d3);
					
					
				} catch (Exception e) {
					
					// TODO: handle exception
					
					
					
					
				}
	    		
	    		map.put(DocumentPath,GetCompareDocumentSimilarity);
	    		
	    		  System.out.println("unsorted map: "+map);
	    	}
	    	 
	    	
	    }
	    sorted_map.putAll(map);
   	 
    	System.out.println("results: "+sorted_map);
    	
    	
    	Set<String> keys = sorted_map.keySet();
		  
    	
		  int i=0;
	        for(String key: keys)
	        {
	        	getSimilarDocument.add(key);
	        	
	        }
	}
	
	
		  
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
		  
		  public class SimilarityMeasure{
			  public class values
				 {
				  int val1;
				  int val2;
				  values(int v1, int v2)
				  {
				   this.val1=v1;
				   this.val2=v2;
				  }
				  public void Update_VAl(int v1, int v2)
				  {
				   this.val1=v1;
				   this.val2=v2;
				  }
				 }
				 
				 public double Cosine_Similarity_Score(String Text1, String Text2)
				 {
					 double sim_score=0.0000000;
					  //1. Identify distinct words from both documents
					  String [] word_seq_text1 = Text1.split(" ");
					  String [] word_seq_text2 = Text2.split(" ");
					  Hashtable<String, values> word_freq_vector = new Hashtable<String, SimilarityMeasure.values>();                                  //new Hashtable<String, Cosine_Similarity.values>();
					  LinkedList<String> Distinct_words_text_1_2 = new LinkedList<String>();
					  
					//prepare word frequency vector by using Text1
					  for(int i=0;i<word_seq_text1.length;i++)
					  {
					   String tmp_wd = word_seq_text1[i].trim();
					   if(tmp_wd.length()>0)
					   {
					    if(word_freq_vector.containsKey(tmp_wd))
					    {
					     values vals1 = word_freq_vector.get(tmp_wd);
					     int freq1 = vals1.val1+1;
					     int freq2 = vals1.val2;
					     vals1.Update_VAl(freq1, freq2);
					     word_freq_vector.put(tmp_wd, vals1);
					    }
					    else
					    {
					     values vals1 = new values(1, 0);
					     word_freq_vector.put(tmp_wd, vals1);
					     Distinct_words_text_1_2.add(tmp_wd);
					    }
					   }
					  }
					  
					  
					  //prepare word frequency vector by using Text2
					  for(int i=0;i<word_seq_text2.length;i++)
					  {
					   String tmp_wd = word_seq_text2[i].trim();
					   if(tmp_wd.length()>0)
					   {
					    if(word_freq_vector.containsKey(tmp_wd))
					    {
					     values vals1 = word_freq_vector.get(tmp_wd);
					     int freq1 = vals1.val1;
					     int freq2 = vals1.val2+1;
					     vals1.Update_VAl(freq1, freq2);
					     word_freq_vector.put(tmp_wd, vals1);
					    }
					    else
					    {
					     values vals1 = new values(0, 1);
					     word_freq_vector.put(tmp_wd, vals1);
					     Distinct_words_text_1_2.add(tmp_wd);
					    }
					   }
					  }
					  
					  //calculate the cosine similarity score.
					  double VectAB = 0.0000000;
					  double VectA_Sq = 0.0000000;
					  double VectB_Sq = 0.0000000;
					   
					  for(int i=0;i<Distinct_words_text_1_2.size();i++)
					  {
					   values vals12 = word_freq_vector.get(Distinct_words_text_1_2.get(i));
					   
					   double freq1 = (double)vals12.val1;
					   double freq2 = (double)vals12.val2;
					   System.out.println(Distinct_words_text_1_2.get(i)+"#"+freq1+"#"+freq2);
					    
					   VectAB=VectAB+(freq1*freq2);
					    
					   VectA_Sq = VectA_Sq + freq1*freq1;
					   VectB_Sq = VectB_Sq + freq2*freq2;
					  }
					  System.out.println("VectAB "+VectAB+" VectA_Sq "+VectA_Sq+" VectB_Sq "+VectB_Sq);
					  sim_score = ((VectAB)/(Math.sqrt(VectA_Sq)*Math.sqrt(VectB_Sq)));
					   
					 
					  return(sim_score);
		  }
		}
		  
}



class ComparatorValue implements Comparator<String> {

    Map<String, Double> base;
    public ComparatorValue(Map<String, Double> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals. 
    
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
	         
	}}
    
}
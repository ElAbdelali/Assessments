package filehandling;

import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 


public class ReadFileIntoList {
	
		public static List<String> readFileIntoList(String fileName) {
			List<String> lines = Collections.emptyList();
			try {
				lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return lines;
		}
		public static void main(String[] args) { 
			List<String> l = readFileIntoList("/Users/ali/Documents/eclipse-workspace/filehandling/test.txt"); 
		  
		    Iterator<String> itr = l.iterator(); 
		    while (itr.hasNext()) 
		      System.out.println(itr.next()); 
		} 

}

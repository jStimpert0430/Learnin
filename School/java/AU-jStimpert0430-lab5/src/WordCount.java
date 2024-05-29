// Joshua Stimpert - Lab 5

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount  extends Thread{
	private String fileName;
	private static int totalWordCount;
	
	
	public WordCount() {
		fileName = "";
	}
	
	public WordCount(String newFileName) {
		fileName = newFileName;
	}
	
	
	public void run() {
		
		try {
			countWordsInFile(fileName);
		}catch(Exception e) {
			
		}
	}
	
	public static void countWordsInFile(String newFileName) throws IOException {
		try {
		File f1 = new File("src/" + newFileName);
		int wordCount = 0;
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s=br.readLine()) != null) {
				String [] words=s.split("[\\s\\-]");
				wordCount += words.length;
			
		}
		br.close();
		addCountTotal(wordCount);
		System.out.println("Total words found in \"" + newFileName + "\" : " + wordCount);
		if(Thread.activeCount() == 2) {
			System.out.println("Total number of words across all files is: " + totalWordCount);
		}
		}catch(IOException ex) {
			System.out.println("filename: " + newFileName + " is invalid");
		}
		
	}
	
	public synchronized static void addCountTotal(int numToAdd) {
		totalWordCount += numToAdd;
	}
}

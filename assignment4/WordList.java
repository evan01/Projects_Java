package assignment4;
import java.util.*;
import java.io.*;
import java.util.Random;

public class WordList {
	//First define our private property Words
	private static ArrayList<String> words;
	
	//declare our static variable random
	private static Random r = new Random();
	
	//method that returns a random word from our ArrayList
	public String getRandomWord(){
		//first define our variables
		String word;
		//pick a random word from our ArrayList
		word=words.get(r.nextInt(words.size()));
		
		return word;
	}

	//method printAll
	public static void printAll(){
		//guessing that it needs to print the arrayList
		System.out.println(words);
	}
	
	//Our constructor for this class
	WordList(String filename) throws IOException {

	//try to do the following,if not, tell the user and throw the exception 
		try{
			//first try reading the filename from my desktop
			File file = new File("/Users/evanknox/Desktop/Text_files/"+(filename)+".txt");
		    BufferedReader Buff = new BufferedReader(new FileReader(file));
		
			//Create our new ArrayList	
				words = new ArrayList<String>();
			//this will read each line in the file and store each line into the BufferedReader
				String line;
				while ((line=Buff.readLine())!=null) {
				words.add(line);
				}
			//closeBufferedReader
				Buff.close();
		}
		catch(IOException e){
			System.out.println("Can't find your file! Using default value.");
			throw e;
		}

	}//endConstructor

}//endWordList
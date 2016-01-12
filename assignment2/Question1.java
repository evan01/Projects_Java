package assignment2;

import java.util.Scanner;
import java.io.*;

public class Question1 {
	public static void main(String[] args) {
		
	isConsecutive();		
	}//end main
	
	public static void isConsecutive () {
		
	//this is our isConsecutive method		
				Scanner sc = new Scanner (System.in);
				String s;
				boolean letter=false,integer=false,isConsecLetter=false,isConsecInt=false;
				
				System.out.println("Hi there, please enter a consecutive String of Letters or numbers");
				s = sc.next();
				
	//first make sure the string is all lowercase
					s = s.toLowerCase(); 
					
	//next we will convert this String to a character Array, this array is called CharArray
					char[] CharArray = s.toCharArray();
				
	//next we will verify whether this String is all integers		
					for (int i=0;i<CharArray.length;i++) {
						if (CharArray [i]>='0' && CharArray[i]<='9') {
							integer = true;}//endif
						else {
							integer = false;
							break;}//endelse	
					}//endloop
			
	//next we will verify whether this String is all letters
					for (int i=0;i<CharArray.length;i++) {	
						if (CharArray [i] >='a' && CharArray [i]<='z') {
								letter = true;}//endif
						else {
							letter = false; 
							break;}//endelse
					}//endloop					
			
	//we will then invoke one of the methods that checks for consecutiveness	
			
			//for letters
					if (letter == true){
						for (int i=0;i<(CharArray.length-1);i++) {
							if (CharArray[i]+1==CharArray[i+1] || CharArray[i]-1==CharArray[i+1]) {
								isConsecLetter = true; }//endif
						else {
							if ((CharArray[i]=='a' && CharArray[i+1]=='z') || (CharArray[i]=='z' && CharArray[i+1]=='a')) {
								isConsecLetter = true;}
							else{
							isConsecLetter = false;
							break;}//endelse
								}//endelse
							}//endloop
						if (1==CharArray.length && letter ==true){
							System.out.println("The letter is consecutive: true");}//endif
						else
							System.out.println("YOU SUCK: " + (isConsecLetter));
					}//endif
					
			//for integers
					if (integer==true){
						for (int i=0;i<(CharArray.length-1);i++) {
							if (CharArray[i]+1==CharArray[i+1] || CharArray[i]-1==CharArray[i+1]) {
								isConsecInt = true; }//endif
					else {
						if ((CharArray[i]=='0' && CharArray[i+1]=='9') || (CharArray[i]=='9' && CharArray[i+1]=='0')) {
							isConsecInt = true;}
						else{
						isConsecInt = false;
						break;}//endelse
						}//endelse
					}//endloop
						if (1==CharArray.length && integer ==true){
							System.out.println("The number is consecutive: true");}//endif
						else	
							System.out.println("The numbers are consecutive: " + (isConsecInt));	
				}//endif

	//last if statements if our tests are inconclusive
			if (integer==false && letter==false) {
				System.out.println("Please enter only numbers or only letters in your string!");}//endif
			
	}//end of isConsecutive method
}//end class

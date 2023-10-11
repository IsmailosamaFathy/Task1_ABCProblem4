package String_arrange;

import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
import java.util.*;

public class Stringe_seperate 
{
	/*
	 * This attribute of type string & private to protect data
	 * it is used to store temporary copy of text 
	 * */ 
	private String str;
	// this setter function to catch text from main which entered by user & store it in attribute
	public void Set_String(String text) 
	{
		str=text;
	}
	/*
	 * In this method I filter text from special characters & white spaces
	 * Then Sorting array of string is to be sorted in ascending order
	*/ 
	public void Print_Wors() 
	{
	/*
	 * Filtering original text from special character & white space 
	 * Then , storing new text in the array of string 
	 *  
	 */	
		String[] words=str.split("[ ?,`;]+");
// sorting array 
		Arrays.sort(words);
			for(int i=0;i<words.length;i++) 
			{
				System.out.println(words[i]);
			}
				
		
		
		
		
	}
	 
	

}

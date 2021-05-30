package Section3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code23 {
		static String[] words = new String[100000];
		static int[] count = new int[100000];
		static int n =0;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	while(true) {
		System.out.println("$");
		String command = sc.next();
		if(command.equals("read")) {
			String fileName = sc.next();
			makeIndex( fileName);
			
		} else if(command.equals("find")) {
			String str = sc.next();
			int index=findWord(str);
			if(index > -1) {
				System.out.println("The word"+ words[index] + " appears "+ count[index] + "times.");
			} else {
				
				System.out.println("The word"+ str + " does not appear ");
			}
			
		} else if(command.equals("saveas")) {
				String fileName = sc.next();
				savaAs( fileName);
			
		} else if(command.equals("exit")) {
			break;
		}
	}
		sc.close();
		
		
	}
	
	static void savaAs(String fileName) {
		PrintWriter outFile;
		try {
			outFile = new PrintWriter(new FileWriter(fileName));
			for(int i = 0; i < n ; i++) {
				outFile.println(words[i] + " "+count[i]);
			}
			
			outFile.close();
		} catch (IOException e) {
			
				System.out.println("Save failed");
				return;
		}
		
	}
	
	static void makeIndex( String fileName){
		
		try {
			Scanner inFile = new Scanner( new File(fileName));
			
			while( inFile.hasNext())	{
				String str = inFile.next();
				
				String trimmed = trimming(str);
				if(trimmed != null) {
					String t = trimmed.toLowerCase();
					addWord(t);
				}
			}
			
			inFile.close();
		} catch (FileNotFoundException e) {

			System.out.println("No file");
			return;
			
		}
	}

	static String trimming(String str) {
		
		int i = 0, j = str.length()-1;
		while( i < str.length() && !Character.isLetter(str.charAt(i)))// 알파벳인지 검사하는 메소드 , 234%$#!
			i++;
		
		while( j >=0  && !Character.isLetter(str.charAt(i)))// 알파벳인지 검사하는 메소드 , 234%$#!
			j--;
		
		if( i > j) {
			
			return null;
		} else {
			String trimmed=str.substring(i, j+1); //[ ) i<= .....<j+1			
			return trimmed;
		}
	}

	static void addWord(String str) {
		int index = findWord(str);  //못찾으면 -1
		if (index != -1) { //found words[index] ==str
			count[index]++;
		} else { //not found
			int i = n-1;
			while(i >=0 && words[i].compareTo(str) > 0) {
				words[i+1]= words[i];
				count[i+1]= count[i];
				i--;
			} 
				words[i+1]=str;
				count[i+1]=1;
				n++;
		}
	}

	static int findWord(String str) {
		
		for(int i = 0; i < n; i++) {
			if(words[i].equalsIgnoreCase (str)) {
				return i;
			}
		}
		return -1;
	}
}

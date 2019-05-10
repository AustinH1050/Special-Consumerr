import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;
class enyyncryption {
	
	
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		
	//}
	//public static String Decript(String lineIn){
		//scanner
		Scanner input = new Scanner(System.in);
		//Vars
		//String lineIn = input.nextLine();
		
		char encrypt = ' ';
		
		//passwords
		String passwords [][] = new String[2][50];
		passwords = FileRead();
		passwords = Decrypt(passwords);
		
	
		
				
	/*
	//encrypt	
		}
		for (int charnum2 = 0; charnum2 < lineIn.length(); charnum2++){
			decript = lineIn.charAt(charnum2);
			switch (encrypt) {
			case 'Y': System.out.print("a"); 
					break; 
			case '1': System.out.print("b"); 
					break; 
			case '9': System.out.print("c"); 
					break; 
			case 'X': System.out.print("d"); 
					break; 
			case '0': System.out.print("e");
					break; 
			case '8': System.out.print("f"); 
					break;
			case 'A': System.out.print("g"); 
					break; 
			case 'z': System.out.print("h"); 
					break; 
			case 'W': System.out.print("i"); 
					break; 
			case '7': System.out.print("j"); 
					break;
			case 'B': System.out.print("k"); 
					break; 
			case 'u': System.out.print("l"); 
					break; 
			case '6': System.out.print("m"); 
					break; 
			case 'V': System.out.print("n"); 
					break; 
			case 'C': System.out.print("o");
					break; 
			case 'v': System.out.print("p"); 
					break;
			case 'Z': System.out.print("q"); 
					break; 
			case 'y': System.out.print("r"); 
					break; 
			case 'U': System.out.print("s"); 
					break; 
			case 'D': System.out.print("t"); 
					break;
			case 't': System.out.print("u"); 
					break; 
			case 'w': System.out.print("v"); 
					break; 
			case 'a': System.out.print("w"); 
					break; 
			case 'T': System.out.print("x"); 
					break; 
			case 'E': System.out.print("y");
					break; 
			case '2': System.out.print("z"); 
					break;
			case 's': System.out.print("A"); 
					break; 
			case '5': System.out.print("B"); 
					break; 
			case 'S': System.out.print("C"); 
					break; 
			case 'F': System.out.print("D"); 
					break;
			case 'x': System.out.print("E"); 
					break; 
			case 'q': System.out.print("F"); 
					break; 
			case 'R': System.out.print("G"); 
					break; 
			case 'G': System.out.print("H"); 
					break; 
			case 'c': System.out.print("I");
					break; 
			case 'b': System.out.print("J"); 
					break;
			case 'j': System.out.print("K"); 
					break; 
			case 'Q': System.out.print("L"); 
					break; 
			case 'H': System.out.print("M"); 
			//		break; 
			case 'i': System.out.print("N"); 
					break;  
			case 'r': System.out.print("O"); 
					break; 
			case 'd': System.out.print("P"); 
					break; 
			case '3': System.out.print("Q"); 
					break; 
			case 'P': System.out.print("R"); 
					break; 
			case 'I': System.out.print("S");
					break; 
			case 'm': System.out.print("T"); 
					break;
			case 'J': System.out.print("U"); 
					break; 
			case 'o': System.out.print("V"); 
					break; 
			case 'e': System.out.print("W"); 
					break; 
			case '4': System.out.print("X"); 
					break;
			case 'O': System.out.print("Y"); 
					break; 
			case 'n': System.out.print("Z"); 
					break; 
			case 'K': System.out.print("1"); 
					break; 
			case 'f': System.out.print("2"); 
					break; 
			case 'p': System.out.print("3");
					break; 
			case 'k': System.out.print("4"); 
					break;
			case 'N': System.out.print("5"); 
					break; 
			case '-': System.out.print("6"); 
					break; 
			case 'L': System.out.print("7"); 
					break; 
			case 'l': System.out.print("8"); 
					break;
			case 'h': System.out.print("9"); 
					break; 
			case ' ': System.out.print("0"); 
					break; 
			case 'M': System.out.print(" "); 
					break; 
			case 'g': System.out.print("-"); 
					break; 
		
		}
*/
		}


		
	
		
	
	public static String[][] FileRead() {
		//file read
		String passwords [][] = new String[1][50];
		BufferedReader reader;
		int now = 0;
		try {
			reader = new BufferedReader(new FileReader(
					"/Users/student/Desktop/Passwords.txt"));
			String line = reader.readLine();
			while (line != null) {
				
				passwords [0][now] = line;
				
				now+=1;
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		return passwords;
	}
	
	
	//end of 


	public static String[][] Decrypt(String passwords [][]) {
			//System.out.println(passwords [0][0]);
			char decript = ' ';
		
			for (int w = 0; w < 50; w++){
			StringBuilder decripter = new StringBuilder(passwords[0][w]);
			
				for (int charnum = 0; charnum < decripter.length(); charnum++){
					decript = decripter.charAt(charnum);
					//encrypt.setCharAt(charnum, 'x');
					
					
					switch (decript) {
					case 'a': decripter.setCharAt(charnum, 'Y'); 
							break; 
					case 'b': System.out.print("1"); 
							break; 
					case 'c': System.out.print("9"); 
							break; 
					case 'd': System.out.print("X"); 
							break; 
					case 'e': System.out.print("0");
							break; 
					case 'f': System.out.print("8"); 
							break;
					case 'g': System.out.print("A"); 
							break; 
					case 'h': System.out.print("z"); 
							break; 
					case 'i': System.out.print("W"); 
							break; 
					case 'j': System.out.print("7"); 
							break;
					case 'k': System.out.print("B"); 
							break; 
					case 'l': System.out.print("u"); 
							break; 
					case 'm': System.out.print("6"); 
							break; 
					case 'n': System.out.print("V"); 
							break; 
					case 'o': System.out.print("C");
							break; 
					case 'p': System.out.print("v"); 
							break;
					case 'q': System.out.print("Z"); 
							break; 
					case 'r': System.out.print("y"); 
							break; 
					case 's': System.out.print("U"); 
							break; 
					case 't': System.out.print("D"); 
							break;
					case 'u': System.out.print("t"); 
							break; 
					case 'v': System.out.print("w"); 
							break; 
					case 'w': System.out.print("a"); 
							break; 
					case 'x': System.out.print("T"); 
							break; 
					case 'y': System.out.print("E");
							break; 
					case 'z': System.out.print("2"); 
							break;
					case 'A': System.out.print("s"); 
							break; 
					case 'B': System.out.print("5"); 
							break; 
					case 'C': System.out.print("S"); 
							break; 
					case 'D': System.out.print("F"); 
							break;
					case 'E': System.out.print("x"); 
							break; 
					case 'F': System.out.print("q"); 
							break; 
					case 'G': System.out.print("R"); 
							break; 
					case 'H': System.out.print("G"); 
							break; 
					case 'I': System.out.print("c");
							break; 
					case 'J': System.out.print("b"); 
							break;
					case 'K': System.out.print("j"); 
							break; 
					case 'L': System.out.print("Q"); 
							break; 
					case 'M': System.out.print("H"); 
							break; 
					case 'N': System.out.print("i"); 
							break;  
					case 'O': System.out.print("r"); 
							break; 
					case 'P': System.out.print("d"); 
							break; 
					case 'Q': System.out.print("3"); 
							break; 
					case 'R': System.out.print("P"); 
							break; 
					case 'S': System.out.print("I");
							break; 
					case 'T': System.out.print("m"); 
							break;
					case 'U': System.out.print("J"); 
							break; 
					case 'V': System.out.print("o"); 
							break; 
					case 'W': System.out.print("e"); 
							break; 
					case 'X': System.out.print("4"); 
							break;
					case 'Y': System.out.print("O"); 
							break; 
					case 'Z': System.out.print("n"); 
							break; 
					case '1': System.out.print("K"); 
							break; 
					case '2': System.out.print("f"); 
							break; 
					case '3': System.out.print("p");
							break; 
					case '4': System.out.print("k"); 
							break;
					case '5': System.out.print("N"); 
							break; 
					case '6': System.out.print("-"); 
							break; 
					case '7': System.out.print("L"); 
							break; 
					case '8': System.out.print("l"); 
							break;
					case '9': System.out.print("h"); 
							break; 
					case '0': System.out.print(" "); 
							break; 
					case ' ': System.out.print("M"); 
							break; 
					case '-': System.out.print("g"); 
							break; 
			
					}
				}
				System.out.println();
				passwords[0][w] = decripter.toString();
			}
			
			return passwords;
		}
	/*public static String[][] Encrypt() {
			
			return passwords;
		}*/

}
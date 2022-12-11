package module6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TasksM6 {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);

//		String word = scan.nextLine();
//		
//	---------------------------------------------------------------------------------------------------------------------------------------------------------------------
//							// CHECK IF THE STRING CONTAINS "JAVA" STARTING FROM EITHER INDEX 0 OR INDEX 1	(TEACHER BETTER)

//			if(word.charAt(0) == 'j' || word.charAt(1) == 'j') {
//				
//				if(word.charAt(2) == 'a' ||  word.charAt(1) == 'a') {
//					
//					if( word.charAt(2) == 'v' || word.charAt(3) == 'v') {
//						
//						if(word.charAt(3) == 'a' || word.charAt(4) == 'a') {
//							System.out.println("true");
//						}
//					}
//					
//				}
//					
//			}else {
//				System.out.println("false");
//			}
//			
//			
//		}

//															TEACHERS VERSION
//		String word = scan.next();
//		
//		boolean result = !word.equals("") && (word.startsWith("java") || word.substring(1).startsWith("java")); 
//		System.out.println(result);


		// The !word.equals("") is used to check if the string is empty, it will be false if it's empty. 
		// Her solution just let us make a boolean variable with conditions that check if java begins at 0 or 1 index of the String.
		// We then print the boolean value.

		//	---------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//													CHECK IF JAVA APPEARS IN STRING	(TEACHER HAD BETTER VERSION)
//		String word = scan.nextLine();
//		int count = 0;
//		int java = 0;
//		
//
//
//      while(count <= word.length() + 1) {
//    	  
//    
//    	  if(word.charAt(count) == 'j') {
//    		  count++;
//    		  if(word.charAt(count) == 'a') {
//    			  count++;
//    			  if(word.charAt(count) == 'v') {
//    				  count++;
//    				if(word.charAt(count) == 'a') {
//    					count++;
//    					java++;
//    				}
//    			}  	
//    		  }
//    	  }else {
//    		  count++;
//    	  }
//    	 
//	      	  if(count == word.length()) {
//    		  break;
//    	  }
//      }
//      
//      System.out.println(java);


// 														TEACHERS VERSION
//		String word = scan.next();
//		
//		int count = 0;
//		
//		for(int i = 0; i < word.length() - 3; i++) {
//			if(word.substring(i, i + 4).equals("java")) {
//				count++;
//			}
//		}
//		System.out.println(count);

		// Once again, the solution that I've missed is the .equals method. I'll be utilizing that more in the future, it's
		// smart to use i as the index in a substring, you can use i and then add however many indexes you need for the closing index.
		// Like in the prefix problem she used i + n so that it would add the length of the prefix to i, along with the .equals method 
		// that allows us to skip checking for each character individually.
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------      
		// COUNT HOW MANY TIMES A SEQUENCE APPEARS IN A STRING (2)
//		
//		String word = scan.nextLine();
//		
//		int count = 0;
//		int hi = 0;
//		
//
//
//		      while(count <= word.length() + 1) {
//    	  
//    
//    	  if(word.charAt(count) == 'h') {
//    		  count++;
//    				if(word.charAt(count) == 'i') {
//    					count++;
//							hi++;
//    				} 
//    	  }else {
//    		  count++;
//   	  }
//    	 
//	      	  if(count == word.length()) {
//    		  break;
//    	  }
//      }
//		
//		System.out.println(hi);


		// 													TEACHERS VERSION

//		String str = scan.nextLine();
//		int count = 0;
//		
//		for(int i = 0; i < str.length() - 1; i++ ) {
//			if(str.substring(i, i + 2).equals("hi")) {
//				count++;
//			}
//		}
//		System.out.println(count);

		// Again, .equals reigns supreme. She used basically the same solution like I did for each problem, but hers was way better.
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------


//					 PROGRAM TO SEE IF A PREFIX OF A STRING REPEATS ANYWHERE IN THE STRING (TEACHER HAD BETTER VERSION)
//	      String str = scan.next();
//	      int n = scan.nextInt();
//	      String prefix = str.substring(0, n);
//	      
//	     
//	      int lineUp = 0;

//	      int count = 0;
//	      
//	      
//	      for(int i = 0; i < str.length(); i++) {
//	    	  
//	    	  if(i <= str.length() && i != 0) {
//	    		  	if(prefix.charAt(lineUp) == str.charAt(i)) {
//    		  		lineUp++;
//
//	    		  	}if(lineUp == prefix.length()) {
//	    		  		count++;
//	    		  		lineUp = 0;
//	    		  		
//	    		  	}
//	    	  }
//	    	    
//	      }if(count == 0) {
//	    	  System.out.println(false);
//	      }else if(count != 0) {
//	    	  System.out.println(true);
//	      }

//															TEACHERS VERSION

//		String str = scan.next();
//		int n = scan.nextInt();
//		
//		String prefix = str.substring(0, n);
//		int count = 0;
//		
//		for(int i = 0; i < str.length() - n; i++) {
//			if(prefix.equals(str.substring(i, i + n))) {
//				count++;
//			}
//		}
//		
//		System.out.println(count >= 2);
//

//   Very smart solution by the teacher, she used the .equals method to check if the prefix was equal to the string at substring i, i + n.
//   So when I ticks up every loop its moving up the string, but we didn't need the line up variable, because we had the equal method.

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------		

		// RETURN THE ID OF THE HTML ADDRESS
//		String html = scan.nextLine();
//
//		
//		if(html.contains("id")) {
//			System.out.println(html.substring(html.indexOf("\"") + 1, html.lastIndexOf("\"")));
//		}else {
//			System.out.println("Invalid input!");
//		}


//---------------------------------------------------------------------------------------------------------------------------------------------------------------------		

		// RETURN EVERYTHING BETWEEN THE TWO BREAD WORDS
//	    	 int breadCount = 0;
//	    	 String str = scan.nextLine();
//	    	 String middle = "";
//	    	 
//	    	 
//	    	 if(str.contains("bread")) {
//	    		 breadCount++;
//	    		 int firstIndex =  str.indexOf("bread");
//	    		 int lastIndex =   str.lastIndexOf("bread");
//	    		 
//	    		 if( firstIndex != lastIndex ){
//	    			 breadCount++;
//	    			 for(int i = firstIndex + 5; i < str.length(); i++){
//	    				 
//	    				middle += str.charAt(i);
//	    				
//	    					if(i >= lastIndex - 1) {
//	    						break;
//	    					}
//	    			 }
//	    			System.out.println(middle); 
//	    		 }
//	    		 
//	    	 }if(breadCount != 2) {
//	    		 System.out.println("nothing");
//	    	 }
//	    	    
// 	

///---------------------------------------------------------------------------------------------------------------------------------------------------------------------		

		// CHECK IF JAVA AND PYTHON APPEAR THE SAME AMOUNT OF TIMES
//	      String sent = scan.nextLine();
//	      
//	      String python = "python";
//	      String java = "java";
//	      int pythonLineUp = 0;
//	      int pythonCount = 0;
//	      int javaLineUp = 0;
//	      int javaCount = 0;
//	   
//	      for(int i = 0; i < sent.length(); i++) {
//	    	  
//	    	  if(sent.charAt(i) == python.charAt(pythonLineUp)) {
//	    		  pythonLineUp++;
//	    	  }if(pythonLineUp == python.length()) {
//	    		  pythonCount++;
//	    		  pythonLineUp = 0;
//	    	  }if(sent.charAt(i) == java.charAt(javaLineUp)) {
//	    		  javaLineUp++;
//	    	  }if(javaLineUp == java.length()) {
//	    		  javaCount++;
//	    		  javaLineUp = 0;
//	    	  }
//	    }	
//	      if(javaCount == pythonCount && pythonCount != 0) {
//	    		  System.out.println(true);
//	    	  }else {
//	    		  System.out.println(false);
//	    	  }	  	    	  


///---------------------------------------------------------------------------------------------------------------------------------------------------------------------

		// PRINT THE FIRST 3 LETTERS OF EACH ELEMENT IN AN ARRAY
//		String[] arr = new String[5];
//		
//		for (int i = 0 ;i < 5; i++) {
//			arr[i] = scan.nextLine();
//		}
//		
//		for(int i = 0; i <= 4; i++) {
//			System.out.println(arr[i].substring(0, 3));
//		}


//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

		// PRINT THE FIRST AND LAST LETTER OF EACH ELEMENT IN AN ARRAY

//		String[] words = {scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine()};	
//		
//		for(int i = 0; i <= 4; i++) {
//			
//		System.out.print(words[i].charAt(0));
//		System.out.println(words[i].charAt(words[i].length() - 1));
//		}


///---------------------------------------------------------------------------------------------------------------------------------------------------------------------		

		// REVERSE A SENTENCE BY WORD, NOT LETTERS.
//		String sentence = scan.nextLine();
//		String reversed = "";
//		String [] sentenceArr = sentence.split(" ");
//
//		Arrays.toString(sentenceArr);
//
//		for(int i = sentenceArr.length - 1; i >= 0; i-- ) {
//			reversed += sentenceArr[i] + " ";
//		}
//		System.out.println(reverse)
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// 										CHECK IF A NUMBER IN AN ARRAY APPEARS TWICE IN A ROW
//		Scanner input = new Scanner(System.in);
//		int[] nums = {5, 6, 6, 4, 5};
//		boolean five = false;
//		for (int i = 0; i + 1 <= nums.length - 1; i++) {
//			if(nums[i] == 5 && nums[i + 1] == 5){
//				five = true;
//			}
//		}System.out.println(five);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//										PRINT FIRST & LAST CHAR
//		Scanner input = new Scanner(System.in);
//		String[] words = {"Hello", "Why", "Bye", "Apple", "Note"};
//
//		for(int i = 0; i <= words.length - 1; i++){
//			char lastChar = words[i].charAt(words[i].length() - 1);
//			char firstChar = words[i].charAt(0);
//			System.out.print(firstChar );
//			if(i == words.length - 1){
//				System.out.println(lastChar);
//			}else{
//				System.out.print(lastChar + ", ");
//			}
//
//		}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//						EACH WORD OF STRING SENTENCE ON SEPERATE LINES
//		Scanner scan = new Scanner(System.in);
//
//		String sentence = scan.nextLine();
//
//		String[] arr = sentence.split(" ");
//
//
//
//		for(int i = 0; i <= arr.length - 1; i++){
//			System.out.println(arr[i]);
//		}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//											EVEN NUMBERS IN AN ARRAY
//	int[] nums = {1,2,4,3,56,7,5,3,2,5,7,8,6};
//		int even = 0;
//		for(int number : nums){
//			if(number % 2 == 0){
//			++even;
//			}
//		}System.out.println(even);
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//								SECONDS CALCULATOR
	Scanner scan = new Scanner(System.in);



	// MY WAY (DOESNT WORK)
	// I was trying to update the inputSeconds variable with every calculation to subtract the seconds I had already used.
	// This was more complicated and produced the wrong results depending on what values I entered.
	// The below method using modulo operators was far superior.

//		System.out.println("Enter seconds: ");
//	int inputSeconds = scan.nextInt();
//	int hours = inputSeconds / 3600;
//	inputSeconds -= hours * 3600;
//	int minutes = inputSeconds / 60;
//	inputSeconds =- inputSeconds % minutes * 60;
//	int seconds = minutes / 60;
//
//	System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds ");

		// BETTER WAY (CORRECT)
//		System.out.println("Enter seconds: ");
//		int inputSeconds = scan.nextInt();  			// 4800
//		int hours = inputSeconds / 3600;    			// 4800 / 3600 = 1
//		int minutes = (inputSeconds % 3600) / 60; 		// 1200 / 60   = 20
//		int seconds = inputSeconds  % 60;				// 4800 % 60   = 0
//		System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds "); // 1 hour 20 minutes 0 seconds
//
//-----------------------------------------------------------------------------------------------------------------------------------------------
		// SPLIT EMAIL BY DOMAIN AND ID
//		String email = scan.nextLine();
//		int count = 0;
//
//		for(int i = 0; i < email.length(); i++){
//			if(email.charAt(i) == '@') {
//				count++;
//			}
//		}if(count > 1 || count == 0){
//			System.out.println("invalid email");
//		}else{
//			String [] arr = email.split("@");
//			System.out.println("Email id: " + arr[0]);
//			System.out.println("Email domain: " + arr[1]);
//		}
//-----------------------------------------------------------------------------------------------------------------------------------------------
//		COMPUTE WITH DO WHILE
//
//		int k = 0;
//		int total = 0;
//
//		do{
//			++k;
//			total += k * k;
//
//		}while(k <= 50);
//
//		System.out.println(total);
//-----------------------------------------------------------------------------------------------------------------------------------------------
		// PRINT * n NUMBER OF TIMES

//		int n = scan.nextInt();
//		int i = 0;
//
//		while(i < n){
//			System.out.print("*");
//			i++;
//		}

//------------------------------------------------------------------------------------------------------------------------------------------------

//	int num = scan.nextInt();
//	next3(num);

	}
//------------------------------------------------------------------------------------------------------------------------------------------------
//			SIMPLE CALCULATOR
//	static void plus(){
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter first number: ");
//		int num1 = scan.nextInt();
//		System.out.println("Enter second number: ");
//		int num2 = scan.nextInt();
//		int sum = num1 + num2;
//		System.out.println("result: " + sum );
//	}

//------------------------------------------------------------------------------------------------------------------------------------------------
//									NEGATE A NUMBER
//	public static double negate(double num){
//		return num * -1;
//	}
//------------------------------------------------------------------------------------------------------------------------------------------------
//								ADDTWO METHOD
//	public static int addTwo(int x, int y){
//		return x + y;
//	}

//------------------------------------------------------------------------------------------------------------------------------------------------
	//METHOD TO ADD THE SUBSTRING 3 TIMES AND RETURN IT AS A STRING
//	public static String makeThreeSubstr(String word, int startIndex, int endIndex){
//		word = word.substring(startIndex, endIndex);
//		String three = "";
//		for(int i = 0; i <= 2; i++){
//			three += word;
//		}
//		return three;
//	}
//------------------------------------------------------------------------------------------------------------------------------------------------
	// METHOD TO GET CHARACTER AT SPECIFIED INDEX OF STRING
//      public static char getChar(String word, int index) {
//
//    	  return word.charAt(index);
//      }
//
//------------------------------------------------------------------------------------------------------------------------------------------------
	// WRITE A METHOD TO RETURN TRUE IF BOTH NUMBERS ARE EVEN, FALSE OTHERWISE.
//      public static boolean	bothEven(int num1, int num2){
//			if(num1 % 2 == 0 && num2 % 2 == 0) {
//				return true;
//			}else {
//			return false;
//		}
//		}
//------------------------------------------------------------------------------------------------------------------------------------------------
	// WRITE TWO METHODS AND COMBINE THEM FOR END RESULT OF: HELLO WORLD!

//
//static void hello(){
////		System.out.print("Hello ");
////	}
////
////	static void world(){
////		System.out.print(" world!");
////	}
//-------------------------------------------------------------------------------------------------------------------------------------------------
	// WRITE A METHOD TO RETURN THE NEXT 3 NUMBERS AFTER THE SPECIFIED NUMBER

//	static void next3(int num){
//		int num1 = num + 1;
//		int num2 = num1 + 1;
//		int num3 = num2 + 1;
//		System.out.println("next 3 are: ");
//		System.out.println(num1 + " " + num2 + " " + num3);
//	}
//--------------------------------------------------------------------------------------------------------------------------------------------------
	// PRINT 5x5 RECTANGLE

	static void printHollowRect(){
		System.out.println("*****");
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*****");
	}


}
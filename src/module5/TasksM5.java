package module5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TasksM5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);

		// PRINT THE LONGEST WORD
//		System.out.println("Enter first word: ");
//		String fWord = input.nextLine();
//		System.out.println("Enter second word: ");
//		String sWord = input.nextLine();
//
//		if(word1.length() < word2.length()) {
//			System.out.println(sWord + " is the largest word");
//		}else if(word1.length() > word2.length()) {
//			System.out.println(fWord + " is the largest word");
//		}
//

		// CHANGE AN ELEMENT AND PRINT IT
//		String [] cars = {"Volvo", "BMW", "Ford", "Mazda", "Toyota"};
//		cars [2] = "Audi";
//	System.out.println(cars [2]);



		// PRINT THE COUNT OF ELEMENTS IN AN ARRAY
//		String [] cars = {"Volvo", "BMW", "Ford", "Mazda", "Toyota", "Honda", "Chevrolet"};
//
//		System.out.println(cars.length);


		// ACCESS A startECIFIC ELEMENT IN A MULTI DIMENSIONAL ARRAY
//		int [] [] myNumbers = {{1,2,3,4}, {5, 6, 7}};
//
//		int myNum = myNumbers [1][2];
//		System.out.println(myNum);
//


		//                PRINT THE ELEMENT AT EACH INDEX
//		int [] intArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
//
//
//		for(int i = 0; i < 10; i++) {
//
//			System.out.println("Element at index " + i + ": " + intArray[i]);
//
//		}

	// 					  PRINT NAMES
//		String [][] names = {{"Mr.", "Mrs.", "Ms."}, {"Smith", "Jones"}};
//		System.out.println(names[0][0] + " " + names[1][0]);
//	    System.out.println(names[0][2] + " " + names[1][1]);




//		double salary = 1700.0;
//		String DendARTMENT = "Driver";
//
//		System.out.println(DendARTMENT + " average salary: " + salary);


		// PRINT HALF OF A WORD
//		System.out.println("Enter a word: ");
//		String word = input.nextLine();
//
//
//			System.out.print(word.substring(0, word.length()/2));
//			System.out.println(word.substring(0, word.length()/2));


//		// PRINTARRAY
//		int [] arr = {75, 30, 120, 4, 194, 222, 9};
//		int count = 0;
//		int sum = 0;
//		int avg = 0;
//		System.out.println(Arrays.toString(arr));
//
//		for (int i = 0; i < arr.length; i++) {
//
//			int j = arr[i];
//			System.out.println(j + " ");
//
//			sum += arr[i];
//
//			avg = sum / arr.length;
//
//			if(arr[i] > 100) {
//				System.out.println(arr[i]);
//				++count;
//			}
//		}
//			System.out.println("The count of numbers bigger than 100 is: " + count);
//			System.out.println("The sum of all the numbers is: " + sum);
//			System.out.println("The average of the numbers comes out to: " + avg);


//		String word = input.nextLine();
//
//		if(word.endsWith("ey")){
//			System.out.println("-eys");
//		}else if(word.endsWith("y")) {
//			System.out.println("-ies");
//		}else if(word.endsWith("ife")) {
//		System.out.println("-ives");
//		}else {
//			System.out.println("-s");
//		}


//	String	a = input.nextLine();
//
//	if(a.contains("Alejandro") && a.contains("project")) {
//		System.out.println("read this mail");
//	}else {
//		System.out.println("don't read");
//	}

//	String sentence = "My name is \"Omar\". Nice to meet you!";
//
//		int startIndex = sentence.indexOf("\"")+1;
//		int endIndex = sentence.lastIndexOf("\"");
//
//		System.out.println(sentence.substring(startIndex, endIndex));



//	String firstName = "";
//	String lastName = "";
//	String uScore = "";
//    String endEmail = "";



//String email = input.nextLine();
//if(email.contains("_")) {
//
//	int firstName = email.indexOf("_");
//    int uScore = email.indexOf("_") + 1;
//    int lastName = email.indexOf("@");
//    int endEmail = email.indexOf("@") + 10;
//
//
//System.out.print(email.substring(uScore, lastName) + email.substring(firstName, uScore) + (email.substring(0, firstName)));
//System.out.print(email.substring(lastName, endEmail));
//
//}else {
//	System.out.println(email);
//}
// mike_tyson@gmail.com

//		String email = input.nextLine();
//
//		int firstName = email.indexOf("_");
//	    int uScore = email.indexOf("_") + 1;
//	    int lastName = email.indexOf("@");
//	    int domain = email.indexOf(".");
//	    int topLevelDomain = email.length() - 1;
//		System.out.println("First name: " + email.substring(0, 1).toUpperCase() + email.substring(1, firstName));
//		System.out.println("Last name: " + email.substring(uScore, uScore + 1).toUpperCase() + email.substring(uScore + 1, lastName));
//		System.out.println("Domain: " + email.substring(lastName + 1, domain));
//		System.out.println("Top-Level Domain: " + email.substring(domain + 1 , topLevelDomain + 1 ));

//
//		 String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
//
//		 String sender, phoneNumber, messageBody;
//
//
//		int sender1 = message.indexOf("<") + 1;
//		int sender2 = message.indexOf(">");
//		int number1 = message.indexOf("[") + 1;
//		int number2 = message.indexOf("]");
//		int body1   = message.indexOf("{") + 1;
//		int body2   = message.indexOf("}");
//
//
//		System.out.println("Sender: " + message.substring(sender1, sender2));
//		System.out.println("Phone Number: " + message.substring(number1, number2));
//		System.out.println("Message body: " + message.substring(body1, body2));

//		String word1 = input.next();
//		String word2 = input.next();
//
//
//		System.out.println(word1 + word2 + word2 + word1);



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//																		STRING METHOD PRACTICE

//		String word = input.next();
//
//		if(word.length() % 2 != 0 && word.length() >= 3) {
//
//			System.out.println(word.substring(word.length()/2, word.length()/2 + 1));
//		}
		
// 			else if(word.length() == 1) {
//			for(int i = 0; i < 3; i++) {
//				System.out.print(word.substring(0, 1));
//			}
//		}
	
//		else if(word.length() % 2 == 0 && word.length() >= 4) {
//			System.out.print( word.substring(word.length()/2 - 1, word.length()/2) + word.substring(word.length()/2, word.length()/2 + 1));
//		}
		
		
//		else if(word.length() % 2 == 0 && word.length() == 2) {
//			System.out.println(word + word);
//		}




//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Task to print middle 3 letters (MY METHOD WAS BETTER THAN THE TEACHERS)

//		String word = input.nextLine();
//
//		if(word.length() >= 5 && word.length() % 2 != 0) {
//
//			System.out.println(word.substring(word.length()/2 - 1, word.length()/2 + 2));
//		}else {
//			System.out.println("invalid");
//		}

		
// 		The teacher used 3 charAt methods in a row, I used one substring and we got the same result. It's not a huge difference but whatever.
		
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------		
		// Task MERGE TWO 3 LETTER WORDS Example: input 1 = aok; input 2 = lol; output = alookl (IMPROVED VERSION IN More Efficient Task Solutions)

//		String word1 = input.nextLine();
//		String word2 = input.nextLine();
//
//		if(word1.length() == 3 && word2.length() == 3) {
//
//                  String p1 = word1.substring(0, 1);
//                  String p2 = word1.substring(1, 2);
//                  String p3 = word1.substring(2, 3);
//                  String p4 = word2.substring(0, 1);
//                  String p5 = word2.substring(1, 2);
//                  String p6 = word2.substring(2, 3);
//			System.out.println(p1 + p4 + p2 + p5 + p3 + p6);
//
//			} else {
//				System.out.println("cannot merge");
//			}



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
		//										 REVERSE A STRING WITH FOR LOOP (SAME AS TEACHER)
//		String word = input.nextLine();
//
//		if(word.length() < 5) {
//			System.out.println("Too short!");
//		}else if(word.length() > 5) {
//			System.out.println("Too long!");
//		}else {
//
//			for(int i = 4; i >= 0; i--) {
//
//				System.out.print(word.charAt(i));
//
//			}
//
//		}


		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
		// BUILD A ROUTE (IMPROVED VERSION IN More Efficient Task Solutions)

//
//		if(start.equalsIgnoreCase("A") && end.equalsIgnoreCase("B")) {
//			System.out.println("right: B found");
//		}else if(start.equalsIgnoreCase("A") && end.equalsIgnoreCase("C")) {
//			System.out.println("right > down: C found");
//		}else if(start.equalsIgnoreCase("A") && end.equalsIgnoreCase("D")) {
//			System.out.println("right > down > left: D found");
//		}else if(start.equalsIgnoreCase("B") && end.equalsIgnoreCase("A")) {
//			System.out.println("down > left > up: A found");
//		}else if(start.equalsIgnoreCase("B") && end.equalsIgnoreCase("C")) {
//			System.out.println("down: C found");
//		}else if(start.equalsIgnoreCase("B") && end.equalsIgnoreCase("D")) {
//			System.out.println("down > left: D found");
//		}else if(start.equalsIgnoreCase("C") && end.equalsIgnoreCase("A")) {
//			System.out.println("left > up: A found");
//		}else if(start.equalsIgnoreCase("C") && end.equalsIgnoreCase("B")) {
//			System.out.println("left > up > right: B found");
//		}else if(start.equalsIgnoreCase("C") && end.equalsIgnoreCase("D")) {
//			System.out.println("left: D found");
//		}else if(start.equalsIgnoreCase("D") && end.equalsIgnoreCase("A")) {
//			System.out.println("up: A found");
//		}else if(start.equalsIgnoreCase("D") && end.equalsIgnoreCase("B")) {
//			System.out.println("up > right: B found");
//		}else if(start.equalsIgnoreCase("D") && end.equalsIgnoreCase("C")) {
//			System.out.println("up > right > down: C found");
//		}else if(start.equalsIgnoreCase(end)) {
//			System.out.println(start + " found");
//		}
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

		// For Loop practice (printing numbers starting at 1 - input inclusive)
//
//		int count = input.nextInt();
//
//		for(int i = 0; i <= count; i++) {
//			System.out.print(i + " ");
//		}
//
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

		// Task to use a while loop to count to 50

//		int	count = 0;
//		while(count <= 50) {
//			System.out.println(count);
//			count++;
//		}

		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
		// 										PRINT A STRING WITHOUT THE LAST LETTER  (SAME AS TEACHERS)

//		String txt = input.next();
//
//		System.out.println(txt.substring(0, txt.length()-1));

		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//																	FREE BOOK CALCULATION (SAME AS TEACHERS)
		
		// Calculate the number of free books a customer will get depending on amount of books
		// bought, and type of membership.

//		   System.out.println("Are you Premium Customer?");
//	        boolean isPremiumCustomer = scan.nextBoolean();
//	        System.out.println("How many books did you purchase?");
//	        int nbooksPurchased = scan.nextInt();
//	        int freeBooks = 0;
//
//		if(isPremiumCustomer && nbooksPurchased >= 5 && nbooksPurchased <= 7) {
//			freeBooks += 1;
//		}else if(isPremiumCustomer && nbooksPurchased >= 8) {
//			freeBooks = (nbooksPurchased / 8) * 2;
//		}else if(!isPremiumCustomer && nbooksPurchased >= 7 && nbooksPurchased <= 11) {
//			freeBooks += 1;
//		}else if(!isPremiumCustomer && nbooksPurchased >= 12) {
//			freeBooks = (nbooksPurchased / 12) * 2 ;
//		}System.out.println(freeBooks);


		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//																ZOMBIE APOCALYPSE (TEACHER HAD A LITTLE BIT BETTER VERSION)
		
//		 Zombie apocalypse, half the population of the city every day until there's nobody left.
//		int inhabitants = scan.nextInt();
//		int days = 0;
//
//
//		for(int i = 0; i <= inhabitants * days; i++) {
//
//			if(inhabitants > 0) {
//				System.out.println("Day " + days + " -> " + inhabitants);
//			}
//
//			    days++;
//			    inhabitants = inhabitants / 2;
//
//
//							if(inhabitants == 0) {
//				System.out.println("---- EXTINCT ----");
//			}
//
//		}


		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//								ENHANCED SHOPPING LIST (MINE WAS BETTER THAN TEACHERS)
//
//		double total = 0;
//		String list = "";
//
//		int count = 1;
//
//		do {
//
//				System.out.println("Enter Item" + count + " and its price: ");
//			    String i1 = scan.next();
//			    double p1 = scan.nextDouble();
//			    total += p1;
//			    list += "Item" + count + ": " + i1 + " Price: " + p1 + ", "  ;
//
//			    System.out.println("Add one more item?");
//
//				String answer = scan.next();
//				if(answer.equalsIgnoreCase("yes")) {
//					count++;
//				}else {
//					break;
//				}
//
//
//
//		}while(count <= 10);
//
//
//		System.out.println(list.substring(0, list.length() - 2));
//		System.out.println("Total price: " + total);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
		//															COUNT DOG AND CAT (TEACHER HAD A BETTER VERSION)
//		String word = scan.nextLine();
//		int count = 0;
//		int dog = 0;
//		int cat = 0;
//
//
//      while(count <= word.length() + 1) {
//    	  
//    	  
//    	  if(word.charAt(count) == 'd') {
//    		  count++;
//    		  if(word.charAt(count) == 'o') {
//    			  count++;
//    			  if(word.charAt(count) == 'g') {
//    				  count++;
//    				  dog++;
//    			  }
//    		  }
//    }
//    	  
//    	  if(count == word.length()) {
//    		  break;
//    	  }
//    	  
//    	  if(word.charAt(count) == 'c') {
//    	count++;
//    		  if(word.charAt(count) == 'a') {
//    			  count++;
//    			 if(word.charAt(count) == 't') {
//    				 count++;
//    				 cat++;
//    			 }
//    	     }
//    	  }else{
//    		  count++;
//    	  }
//    	  if(count == word.length()) {
//    		  break;
//    	  }
//      }
//
//      if(dog == cat) {
//    	  System.out.println("true");
//      }else if(dog != cat) {
//    	  System.out.println("false");
//      }































	}// Main method scope


	public static String reverseString(String str) {
		if(str.length() == 5) {

			return reverseString(str.substring(1)) + str.charAt(0);

		}else if(str.length() <= 4) {
			System.out.println("Too short!");
			return str;
		}else if(str.length() >= 6) {
			System.out.println("Too long!");
			return str;
		}
		return str;

	}



//	public static void printResult() {
//		System.out.println(5*40);
//		System.out.println(number1);
//	}


} // Class scope
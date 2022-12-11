package module5;

import java.util.Scanner;

public class MoreEfficientTaskSolutionsM5 {

	public static void main(String[] args) {
		

		/*								BUILD A ROUTE
		 * ----------------------------------------------------------------------------
		 * When I did this task, I wrote around 20 lines of if and if else statements
		 * example: 
		 * 
		 * 			if(start.equealsIgnoreCase == "d" && end.equalsIgnoreCase == "a"){
		 * 	System.out.println("right > down > left: D found"); 
		 *   		if(start.equalsIgnoreCase("A") && end.equalsIgnoreCase("B")) {
		 *	System.out.println("right: B found");
		 *		}else if(start.equalsIgnoreCase("A") && end.equalsIgnoreCase("C")) {
		 *	System.out.println("right > down: C found");
		 *		}else if(start.equalsIgnoreCase("A") && end.equalsIgnoreCase("D")) {
		 *		}else if(start.equalsIgnoreCase("B") && end.equalsIgnoreCase("A")) {
		 *	System.out.println("down > left > up: A found");
		 *		}else if(start.equalsIgnoreCase("B") && end.equalsIgnoreCase("C")) {
		 *	System.out.println("down: C found");
		 *
		 * doing that ~20 times to make up for all the combinations is hard and doesn't make sense. 
		 * look below for a way better solution
		 * */ 
		
															// TEACHERS VERSION
//		Scanner scan = new Scanner(System.in);
//		String start = scan.next();
//		String end = scan.next();
//		
//		String[] points = {"a","b","c","d","a"};
//		String[] steps = {"right","down","left","up","right"};
//		
//		if(start.equalsIgnoreCase(end)) {
//			System.out.println(start + " found");
//		}
//		
//		else{
//			for (int i = 0; i <= 4; i++) {
//				// 1 step 2 points (A>B, B>C, C>D, D>A) <- cases where start and end are 1 step away
//				if(start.equalsIgnoreCase(points[i]) && end.equalsIgnoreCase(points[i + 1])) {
//					System.out.println(steps[i] + ": " + points[i + 1] + " found");
//					break;
//				}
//				// 2 step 
//				else if(start.equalsIgnoreCase(points[i]) && end.equalsIgnoreCase(points[i + 2])) {
//					System.out.println(steps[i] + " > " + steps[i + 1] + ": " + points[i + 2] + " found");
//					break;
//				} // 3 step
//				else if(start.equalsIgnoreCase(points[i]) && end.equalsIgnoreCase(points[i + 3])) {
//					System.out.println(steps[i] + " > " + steps[i + 1] + " > " + steps[i + 2] +  ":  " + points[i + 3] + " found");
//					break;
//				}  
//			}
//		}
// 				In summary, the teacher utilized arrays to store the data points where I used a whole bunch of if statements for each possibility.		
		//      She used loops and arrays to give directions, using the value of i to loop through arrays and adding + 1, + 2, or + 3 to the i
		// 		Depending on how many steps needed to be completed. She also added an extra 'a' and "right" onto the end of each array.
		//      She did this to make up for the possibility of being 1 move away so java doesn't think 'd' and 'a' are really 3 apart.
		
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//														MERGE TWO 3 LETTER WORDS 
		Scanner scan = new Scanner(System.in);
		// MY VERSION IS BELOW																			
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
		
		
//													TEACHERS VERSION
//		String word1 = scan.nextLine();													
//		String word2 = scan.nextLine();	
//		
//		if(word1.length() == 3 && word2.length() == 3) {
//			System.out.println("" + word1.charAt(0) + word2.charAt(0) + word1.charAt(1) + word2.charAt(1) + word1.charAt(2) + word2.charAt(2));
//		}else {
//			System.out.println("Cannot merge");
//		}

		// To summarize why the teachers version was better than mine, he didn't create a new variable for each letter.
		// I did that but it was unnecessary, you can use the charAt() method for a more efficient block of code.
//---------------------------------------------------------------------------------------------------------------------------------------------------------------		
//															COUNT CATS AND DOGS 
		
//		String word = scan.nextLine();
//		int count = 0;
//		int dog = 0;
//		int cat = 0;
//		
//      while(count <= word.length() + 1) {
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
		
// 																TEACHERS VERSION
		
//		String word = scan.nextLine();
//		int countCat = 0;
//		int countDog = 0;
//		
//		
//		
//			while(word.contains("dog") || word.contains("cat")) {
//				if(word.contains("cat")) {
//					word = word.replaceFirst("cat", "");
//					countCat++;
//				}
//				if(word.contains("dog")) {
//					word = word.replaceFirst("dog", "");
//					countDog++;
//				}
//				System.out.println(countCat == countDog);
//			}
		
		// The teachers version for this one was a lot better than mine. Instead of checking for each individual character in dog and cat
		// while using the length of the word as condition for the loop, she used the condition of the word containing cat or dog.
		// After that she used the replaceFirst() method to replace the first instance of the string "cat" or "dog" with a blank string.
		// This erases each instance of cat or dog while adding to the count, so we still get the same result at the end of the day.
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------			
//															ZOMBIE APOCALYPSE 
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
		
//															TEACHERS VERSION
		
//		int inhabitants = scan.nextInt();
//		int days = 0;
//		
//		while(inhabitants != 0) {
//			System.out.println("Day " +days+ " -> " + inhabitants);
//			inhabitants /= 2;
//			days++;
//		}
//		System.out.println("-----EXTINCT-----");
		
// 			The teachers version was better than mine, she utilized the while loop, it makes more sense than the for loop because I can just say while inhabitants != 0
		//  Instead of all that extra crap I had to add into the condition. Now that I look I see that my if statement accomplished what her while loop did, it's 
		//  extra bloat that my code doesn't need.
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

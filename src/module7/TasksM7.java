package module7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TasksM7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // CHECK IF EACH ELEMENT IN AN ARRAY IS POSITIVE OR NEGATIVE
//
//        Scanner inp = new Scanner(System.in);
//        int size = inp.nextInt();
//        //#2 Your code here
//        int[] arr = new int[size];
//
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = inp.nextInt();
//        }
//
//        isPos(arr);
//
//    }
//
//    public static void isPos(int[] arr) {
//
//        for(int i = 0; i <= arr.length-1; i++){
//            if(arr[i] < 0){
//                System.out.println("not positive");
//            }else{
//                System.out.println("positive");
//            }
//
//        }
//
//    }
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//          FOR LOOP TO PRINT 97 ASTERIKS WITHOUT USING ANYTHING BUT K VARIABLE

//        int k = 1;
//
//        for(k = 1; k < 98; k++){
//            System.out.print("*");
//        }
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //  TREE GROWS 1 CM FOR THE FIRST 3 YEARS, AND 2 CM FOR EVERY YEAR AFTER THAT. SHOW 10 YEARS OF GROWTH USING WHILE LOOP.

//        int age = 1;
//        int growth = 1;
//        int size = 1;
//
//        while(age <= 10){
//            if(age < 3){
//                System.out.println("year " + age + " - growth " + growth + " cm");
//                System.out.println("tree size: " + size + "cm");
//                ++age;
//                ++size;
//            } else if (age == 3) {
//                System.out.println("year " + age + " - growth " + growth + " cm");
//                System.out.println("tree size: " + size + "cm");
//                ++age;
//                size += 2;
//            } else if (age > 3) {
//                growth = 2;
//                System.out.println("year " + age + " - growth " + growth + " cm");
//                System.out.println("tree size: " + size + "cm");
//                size += growth;
//                ++age;
//
//            }
//
//        }

        //		for(int i = 0; i < word.length() - 3; i++) {
//			if(word.substring(i, i + 4).equals("java")) {
//				count++;
//			}
//		}


        String main = "Danny";
        String cover = "n";
        StringBuilder covered = new StringBuilder(main);
        int count = 0;


        if (main.contains(cover)) {

            for (int i = 0; i < main.length(); i++) {


            }


        }




    }














    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

 // Here we are trying to cover the specified substring with [] wherever it appears in the String. I could not figure this out for the life of me.
 // The teachers explanation is below.
//    public static String coverString(String main, String cover){
//         StringBuilder covered = new StringBuilder(main);
//        if(main.contains(cover)){
//
//            for(int i = 0; i < main.length(); i++){
//
//                if (main.charAt(i) == cover.charAt(i))
//                {
//                            if(main.substring(i, i + cover.length() - 1).equalsIgnoreCase(cover)){
//                            }
//                }
//            }
//        }
//        main = String.valueOf(covered);
//        return main;
//    }
        //          TEACHERS ANSWER BELOW
    // What we're doing is starting with an empty String, and if main contains cover
    // we assign main to temp, but we replace cover with "[" + cover + "]"
    // This replaces every instance of the cover with itself but wrapped in brackets.
    public static String coverString (String main, String cover){
        String temp = "";

        if(main.contains(cover)){
            temp += main.replace(cover, "[" + cover + "]");
            return temp;
        }else{
            return "[" + main + "]";
        }


    }






    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static String uniqueChars(String str) {

        String temp = "";
        for(int i = 0; i < str.length(); i++){

            if(temp.indexOf(str.charAt(i)) == -1){
                temp += str.charAt(i);
            }
        }


        return temp;
    }


//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static String mergeStrings(String one, String two){
        String s3 = one + two;
        String merge = "";

        for(int i = 0; i < s3.length(); i++){
            if(i < one.length()){
                merge += one.charAt(i);
            }if(i < two.length()){
                merge += two.charAt(i);
            }else{
                break;
            }

        }
        return merge;
    }


//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static boolean getThunderBlazz(boolean available,boolean gift,int ingredient1,int ingredient2,int ingredient3){
        boolean didYouGetBlazz;

        if(available == true || gift == true){
            didYouGetBlazz = true;
        } else if ((ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3)
                || (ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2)) {
            didYouGetBlazz = true;
        }else {
            didYouGetBlazz = false;
        }


        return didYouGetBlazz;
    }

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year){
        boolean roomBooked;
     if(year == 2018 && isAvailable == true){
         if(month == 7 && day > 0 && day <= 8){
             roomBooked = false;
         } else{
             roomBooked = true;
         }

     }else {
         roomBooked = false;
     }

    return  roomBooked;
    }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //   RETURN TRUE IF BOTH A AND B ARE TRUE, OR C IS TRUE, OR ALL 3.

    boolean threeLocks(boolean a, boolean b, boolean c){
        if(a == true && b == true || c == true || a == true && b == true && c == true){
            return true;
        }else {
            return false;
        }
    }


//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//       WATER TAX

        public static double waterTax(double units){
        double bill = 0.0;

        if(units <= 50){
            bill = units * 0.60;
        }else if(units > 50 && units < 100){
            bill = units * 0.90;
        }else if(units >= 100 && units <= 150){
            bill = (units * 0.90) + 50;
        }else{
            bill = (units * 0.90) + 100;
        }


        return bill;
        }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//              CHECK IF ONE OR BOTH BOOLEAN VALUES ARE TRUE




    public static boolean hamletQuote(boolean toBe, boolean notToBe ){
        if(toBe == true || notToBe == true){
            return true;
        }else {
            return false;
        }

    }
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                // PROFITS
    public static String c_profits(int buyPrice, int sellPrice){

        if(buyPrice > sellPrice){
            return "loss";
        } else if(buyPrice < sellPrice) {
            return "profit";
        }else {
            return "no loss";
        }



    }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //          MAX METHOD (WHAT NUMBER IS THE MAX)

        public static int max(int x, int  max){
            if(x > max){
                return x;
            }else {
                return max;
            }

        }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // COUNT APPEARANCE METHOD
    public static int count_appearance(String[] array, String t){
        int count = 0;
        for (String word: array) {
            if(word.equals(t)){
                ++count;
            }
        }


        return count;
    }



//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//          CREATE A METHOD THAT TAKES AN ARRAY AND A NUMBER AS A PARAMETER
//          THAT WILL CREATE A NEW ARRAY IDENTICAL TO THE INITIAL ARRAY, BUT ADDING THE NUMBER TO THE END OF THE NEW ARRAY.

    public static int[] add_to_r(int[] initialArray,int newNumber) {
        //create new array with one more position.
        int [] arr = new int[initialArray.length + 1];

        for(int i = 0; i <= initialArray.length - 1; i++ ){
            arr[i] = initialArray[i];
        }
        arr[initialArray.length] = newNumber;

        initialArray = arr;

        return initialArray;
    }



//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                              Calculate the cube of a number (n = n*n*n) with a method

    public static int cube(int n){
        n = n * n * n;
        return n;
    }
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//          SIGNUM METHOD
        public static int sign(int n){
        if(n >= 1){
            return 1;
        }else if(n < 0){
            return -1;
        }else{
            return 0;
        }

        }





    }


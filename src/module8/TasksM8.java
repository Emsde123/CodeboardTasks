package module8;

import java.util.*;

public class TasksM8 {
    public static void main(String[] args) {


        System.out.println(isAnagram("Santa", "Sfcan"));





    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //      Anagram

    public static boolean isAnagram(String word1, String word2) {

        if (word1.length() == word2.length()) {
            String mergeWord1 = word1.replace(" ", "");
            String mergeWord2 = word2.replace(" ", "");
            mergeWord1 = mergeWord1.toLowerCase();
            mergeWord2 = mergeWord2.toLowerCase();

            char[] word1Arr = mergeWord1.toCharArray();
            char[] word2Arr = mergeWord2.toCharArray();


            Arrays.sort(word1Arr);
            Arrays.sort(word2Arr);
            int count = 0;
            for(int i = 0; i < word1Arr.length; i++){
                if(word1Arr[i] == word2Arr[i]){
                    count++;
                }
            }
            if(count == word1Arr.length){
                return true;

            }else {
                return false;
            }



        }else {
            return false;
        }

    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //      Palindrome
    public static boolean isPalindrome(String check) {
        // your code here

        String mergePali = check.replace(" ", "");
        String reversePali = "";
        for(int i = mergePali.length() - 1; i >= 0; i--){
            reversePali += mergePali.charAt(i);
        }
        if(mergePali.equalsIgnoreCase(reversePali)){
            return true;
        }else{
            return false;
        }

    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //      appendPosSum
    public static ArrayList appendPosSum(ArrayList<Integer> al){
        ArrayList<Integer> posSum = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < al.size(); i++){
            if(al.get(i) > 0){
                posSum.add(al.get(i));
                sum += al.get(i);
            }
        }
        posSum.add(sum);

        return posSum;
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //      Remove all
    public static ArrayList removeAll(ArrayList<String>wordList, String targetWord){

        for(int i = 0; i < wordList.size(); i++){
            if(wordList.get(i).equals(targetWord)){
                wordList.remove(i);
            }
        }


        return wordList;
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //      Add 2 arraylists together
    public static ArrayList combineAL(ArrayList<String>wl1,ArrayList<String> wl2){


        ArrayList<String> combined = new ArrayList<>();

        for(String eachElement : wl1){
            combined.add(eachElement);
        }
        for (String eachElement : wl2){
            combined.add(eachElement);
        }

        return combined;
    }


    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //          Add words???
    public static void test(ArrayList<String> words)	{
    words.add(0, "hey");
    words.add(3,"yo");
    }

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //          Add doubles in arraylist
    public static void test2(ArrayList<Double> dubs)	{
        dubs.remove(0);
        dubs.remove(0);
    }

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //          Sum of ArrayList
    public static int sum(ArrayList<Integer> ints)	{
        int sum = 0;
        for(int i = 0; i < ints.size(); i++){
            sum += ints.get(i);
        }

        return sum;
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //          Git Gud
    public static void test1(ArrayList<String> words)	{
        //write code here
        words.remove(0);
        words.add(0, "git");
        words.remove(2);
        words.add(2, "gud");

    }

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //          Manipulating List
    public static ArrayList<String> test() {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Alex");
        names.add("Tom");
        names.add("John");
        names.add("Robert");


        return names;
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //          Min value in array
    public static int minValue(int[] num) {
        int min = 0;
        for (int i = 0; i < num.length; i++) {

            for (int j = 1; j < num.length; j++) {
                if (num[j] < num[i] && min > num[j]) {
                    min = num[j];
                }
            }

        }
        return min;
    }


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //          Reverse a String
public static String reverse(String input){
        String reversed = "";
        for(int i = input.length()-1; i >= 0; i--){
            reversed += input.charAt(i);
        }
        return reversed;
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //          Merge arrays
public static int[] mergR(int[] a, int[] b) {

  int a1 = a.length;
  int b1 = b.length;
  int arrLength = a1 + b1;
  int[] merge = new int[arrLength];

   for(int i = 0; i < a1; i++){
       merge[i] = a[i];
   }
    for(int i = 0; i < b1; i++){
        merge[a1 + i] = b[i];
    }

return merge;
}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //          Lame database (WE DID IT!!!!!!!!)
    /*

    example use of the method:
m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
returns:  1etsy#2wooden#3spoon#4aaa
    * */

public static String lameDb(String db, String op, String id, String data) {
    String[] arr = db.split("#");
    List<String> newArr = new ArrayList<>();
    int idx = Integer.parseInt(id) - 1;
    String replaced = "";

    if (op.equalsIgnoreCase("add")) {
        String added = db + "#" + id + data;
        return added;
    } else if (op.equalsIgnoreCase("edit")) {
        for (int i = 0; i < arr.length; i++) {
            newArr.add(arr[i]);
        }
        newArr.remove(idx);
        newArr.add(idx, id + data);

        replaced = newArr.toString();
        return replaced.substring(1, replaced.length() - 1).replace(", ", "");
    } else if (op.equalsIgnoreCase("delete")) {
        for (int i = 0; i < arr.length; i++) {
            newArr.add(arr[i]);
        }
        newArr.remove(idx);
        replaced = newArr.toString();
        return replaced.substring(1, replaced.length() - 1).replace(", ", "");
    }else{
        return db;
    }



}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
   //           Remove the first character
    public static String removeFirst(String target){

        return target.substring(1, target.length());
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//              Return the longest String
public static String biggerS(String a ,String b){
        if(a.length() > b.length()){
            return a;
        }else{
            return b;
        }
}


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//              Insert word at the 3rd character of target
    public static String at3(String target,String word){
        StringBuilder str = new StringBuilder(target);
        str.insert(3, word);
        target = str.toString();
        return target;
    }

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //      Shorten the String to the length of maxLength. Cut off the rest.
    public static String limit(String text, int maxLength){
        return text.substring(0, maxLength);
    }

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//          Take 2 words as param, remove all instances of badWord.
    public static String clean (String text, String badWord){
            String newText = text.replace(badWord, "");
            return newText;
    }

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



}

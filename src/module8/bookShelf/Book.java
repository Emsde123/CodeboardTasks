package module8.bookShelf;

import java.util.ArrayList;

public class Book {

    // Represents an individual copy of a book

    //instance variables for Book object
    private String author;
    private String title;
    private int id;
    private int pages;
    //static variable to track number of books with unknown author
    private static int unknownAuthors;


    public static String capitalize(String word) {
        String finalWord = "";
        if(word.equals("")){
            return "";
        }else if(word.contains(" ")){
            String[] eachWord = word.split(" ");
            for(String wordToCap : eachWord){
               finalWord += capitalize(wordToCap) + " ";
            }
          return finalWord;
        } else{
            String lowercase = word.toLowerCase();
            String uppercaseFirst = lowercase.substring(0,1).toUpperCase();
            String title = uppercaseFirst + lowercase.substring(1, lowercase.length());
            return title;
        }

    }


    public static Boolean isTitleWord(String word) {

        ArrayList<String> wordCheck = new ArrayList();
        wordCheck.add("a");
        wordCheck.add("an");
        wordCheck.add("the");
        wordCheck.add("and");
        wordCheck.add("but");
        wordCheck.add("for");
        wordCheck.add("nor");
        wordCheck.add("or");
        wordCheck.add("so");
        wordCheck.add("yet");
        wordCheck.add("at");
        wordCheck.add("by");
        wordCheck.add("in");
        wordCheck.add("into");
        wordCheck.add("near");
        wordCheck.add("of");
        wordCheck.add("on");
        wordCheck.add("to");
        wordCheck.add("than");
        wordCheck.add("via");
        if(wordCheck.contains(word)){
            return false;
        }else{
            return true;
        }

    }


    public Book() {
    }

    /**
     * 4 args constructor. accepts id, author, title, pages
     * CALLS SETTER methods to assign to instance variables.
     * ex: setId(id);
     * It does NOT directly assign to the instance variable
     * ex: NO => this.id = id;
     */
    public Book(int id, String author, String title, int pages) {
        setId(id);
        setAuthor(author);
        setTitle(title);
        setPages(pages);
    }

    /**
     * setAuthor method will be used to set value to private author of the Book
     * @param author : String
     * Conditions:
     *    => if parameter author is value is empty, 1) "Unknown" is assigned to instance variable author
     *                                             2) static unknownAuthors is incremented by one.
     *    => Each word in Book author's name should be capitalized. CALL capitalize method
     *  Example:
     *  Book b = new Book();
     *  b.setAuthor("mArufJon temirov"); => assigns "Marufjon Temirov" to this.author
     *  b.setAuthor("ironMAN"); => assigns "Ironman" to this.author
     *  b.setAuthor("") => assigns "Unknown" to this.author and unknownAuthors++
     */
    public void setAuthor(String author) {
        if(author.equals("")){
            this.author = "Unknown";
            unknownAuthors++;
        }else{
            capitalize(author);
        }
    }

    /**
     * setTitle method will be used to set value to private title of the Book
     * @param title : string
     * Conditions:
     *   => if title is single word, capitalize it and assign to this.title.
     *
     *
     *   => if title is empty, assign "" to this.title (<- we will handle this in Shelf class properly)
     *
     *   => You need to capitalize each word of title except articles, coordinate conjunctions, or prepositions.
     *              See full list in isTitleWord method, they need to be all lowercase.
     *              -> Call isTitleWord() method to check if a word needs to be capitalized or not.
     *              -> Call capitalize method to capitalize title words.
     *   => First word is always capitalized regardless if it is article etc.
     *   Ex:
     *      Book book = new Book();
     *      book.setTitle("MaruF The cool"); => "Maruf the Cool" is assigned to this.title
     *
     *      book.setTitle("the Chronicles OF TrumP"); => "The Chronicles of Trump" is assigned to this.title
     *
     *
     */
    public void setTitle(String title) {
        if(!title.contains(" ")){
            this.title = capitalize(title);
        }else if(title.equals("")){
            this.title = "";
        }else if(title.contains(" ")){
            String[] eachWordOfTitle = title.split(" ");
            String capTitle = capitalize(eachWordOfTitle[0]);
            for(String wordCheck : eachWordOfTitle){
                if(isTitleWord(wordCheck)){
                   capTitle += " " + capitalize(wordCheck) + " ";
                }else {
                    capTitle += wordCheck.toLowerCase() + " ";
                }

            }



        }
    }

    /**
     * toString instance method, String representation of the Book object
     * @return String
     * Format includes author, title, id, pages of the Book object:
     * Book[author=Marufjon T, title=Selenium Cookbook, id=10, pages=300]
     */
    public String toString() {


    }


    /**
     * Getter methods for static unknownAuthors
     * @returns unknownAuthors value
     */
    public static int getUnknownAuthors(){


    }

    /**
     * Getter methods for private pages
     * @returns pages value
     */
    public int getPages() {

    }

    /**
     * Setter method for private pages. No conditions
     * @param pages
     */
    public void setPages(int pages) {



    }

    /**
     * public Getter method for private author
     */
    public String getAuthor() {

    }


    /**
     * public Getter method for private title
     */
    public String getTitle() {


    }


    /**
     * public Getter method for private id
     */
    public int getId() {

    }
    /**
     * public setter method for private id
     */
    public void setId(int id) {



    }
}

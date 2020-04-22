import java.util.Scanner;

/*
* This program was created for a Java Bootcamp assignment
* It prompts the user for a word and an index value.
* Then it displays the word length and the substring before the index value.
*/
public class StringMethods {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      //Prompt user to enter a word
      System.out.print("Enter a word: ");
      String word = keyboard.nextLine();

      //Prompt user to enter an index value
      System.out.print("Enter a number as an index: ");
      int index = keyboard.nextInt();

      //Display length of word entered by the user
      //Display the characters of the word that are before the index value
      System.out.println("Then length of " + word + " is " + word.length());
      System.out.print("The substring from 0 to " + index + " is: ");
      System.out.println(word.substring(0,index));
   }
}

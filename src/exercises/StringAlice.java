package exercises;

import java.util.Scanner;
import java.lang.Math;
public class StringAlice {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter term to search: ");
        String search = input1.nextLine();

        boolean container = alice.contains(search);
        int index = alice.indexOf(search);
        int length = search.length();
        String alice2;

        if(container == true){
            System.out.println("Index of word: " + index);
            String substring1 = alice.substring(0,index);
            String substring2 = alice.substring(index,index+length);
            String substring3 = alice.substring(index+length +1,alice.length()-1);
            alice2 = substring1.concat(substring3);
            //alice2 = alice2.trim();
            System.out.println("Your new string is: " + alice2);
        }
        System.out.println("Your search term was: " + search + " and its length is " + length + " characters.");
        System.out.println("The results of your search are: " + container);

    }
}

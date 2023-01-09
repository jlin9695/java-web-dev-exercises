package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListPractice {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static void fiveLetter(ArrayList<String> arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the words you want: ");
        int longth = input.nextInt();
        input.close();
        for (String word: arr) {
            if (word.length() == longth) {
                System.out.println(word);
            }
        }
    }
}

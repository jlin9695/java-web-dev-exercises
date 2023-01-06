package exercises;

import java.util.Scanner;

public class MPG_Measuring {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        int miles = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter gas consumed: ");
        int gas = input2.nextInt();

        int mpg = gas/miles;
        System.out.println("Your miles per gallon is: " + mpg);
    }
}

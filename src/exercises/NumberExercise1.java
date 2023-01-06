package exercises;
import java.util.Scanner;

public class NumberExercise1 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter rectangle length: ");
        int length = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter rectangle width: ");
        int width = input2.nextInt();

        int area = length * width;
        System.out.println("Rectangle area: " + area );
    }
}

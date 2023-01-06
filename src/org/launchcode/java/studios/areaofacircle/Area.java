package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your desired radius. ");
        boolean radi = input.hasNextDouble();
        double r;
        if(radi){
            r = input.nextDouble();
            while (r < 0){
                System.out.println("Please enter a positive radius. ");
                radi = input.hasNextDouble();
                if(radi){
                    r = input.nextDouble();
                }
                else {
                    System.out.println("You need to enter a valid number.");
                    System.exit(1);
                }
            }
            double area = Circle.getArea(r);
            System.out.println("Your Circle has an area of " + area + " units.");
        }
        else {
            System.out.println("You need to enter a valid number.");
            System.exit(1);
        }

//        try{
//            r = input.nextDouble();
//        } catch (Exception e){
//            System.out.println("You did not input a number. ");
//            System.exit(1);
//        }


//        do {
//            System.out.println("Please enter your desired radius. ");
//            r = input.nextDouble();
//        } while (r < 0);
    }
}

package org.launchcode.java.studios.charCount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class charCounter {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms" +
                " has to be zero to start with." +
                " So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored" +
                " allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your desired quote. ");
        String quote2 = input.nextLine();
        char[] breakdown = quote.toCharArray();
//        char[] breakdown2 = quote2.toCharArray();
/*
        for(char character : counter){
            System.out.println(character);
        }
*/

        HashMap<Character, Integer> counter = new HashMap<>();
        for (char character: breakdown){
            if(!Character.isLetter(character)){
                continue;
            }
            if(!counter.containsKey(Character.toUpperCase(character))){
                counter.put(Character.toUpperCase(character),1);
            } else {
                counter.put(Character.toUpperCase(character),counter.get(Character.toUpperCase(character)) + 1);
            }
        }
        for(Map.Entry<Character, Integer> symbol : counter.entrySet()){
            System.out.println(symbol.getKey() + ": " + symbol.getValue());
        }
////        HashMap<Character, Integer> counter2 = new HashMap<>();
////        for (char character: breakdown2){
////            if(!counter2.containsKey(character)){
////                counter2.put(character,1);
////            } else {
////                counter2.put(character,counter2.get(character) + 1);
////            }
////        }
//        for(Map.Entry<Character, Integer> symbol : counter2.entrySet()){
//            System.out.println(symbol.getKey() + ": " + symbol.getValue());
//        }
        //System.out.println(breakdown.length);
    }
}

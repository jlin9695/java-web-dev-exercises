package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayCreationPractice {
    public static void main(String[] args) {
        String sentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] sent = sentence.split("\\.");
        int[] numbers= {1,1,2,3,5,8};
        for(int number: numbers){
            if(number%2 ==1){
                System.out.println(number);
            }
        }
        System.out.println(Arrays.toString(sent));



    }
}

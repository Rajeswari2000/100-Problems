package Problems_91_to_100;

import java.util.Arrays;
import java.util.Collections;

public class Problem_91 {
    public static void main(String[] args) {
      //Java Program to sort the characters in a word in descending

        int n = 4;
        String [] cities = {"Chennai","Ahmedabad","Delhi","Mumbai"};
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (cities[i].compareTo(cities[j]) < 0) {
                    // swapping
                    temp = cities[i];
                    cities[i] = cities[j];
                    cities[j] = temp;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(cities[i]);
        }

        //Approach 2


        String [] names={"Ajay","Ramesh","Suresh","Vinoth"};

        System.out.println("Approach 2: ");
        Arrays.sort(names, Collections.reverseOrder());
        System.out.println(Arrays.toString(names));

    }
}

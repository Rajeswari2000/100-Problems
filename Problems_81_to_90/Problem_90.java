package Problems_81_to_90;

import java.util.Arrays;

public class Problem_90 {
    public static void main(String[] args) {
       //Java Program to sort the words in ascending


        //approach 1

        int n = 4;
        String [] cities = {"Chennai","Ahmedabad","Delhi","Mumbai"};
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (cities[i].compareTo(cities[j]) > 0) {
                    // swapping
                    temp = cities[i];
                    cities[i] = cities[j];
                    cities[j] = temp;
                }
            }
        }

        System.out.println("Approach 1: ");
        for (int i = 0; i < n; i++) {
            System.out.println(cities[i]);
        }

        //approach 2

        String [] names={"Ajay","Ramesh","Suresh","Vinoth"};

        System.out.println("Approach 2: ");
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}

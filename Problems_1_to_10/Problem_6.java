package Problems_1_to_10;

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        //Write a program for the following. Let consider 20 students in a class with the roll no
        //101-120. We are going to split them into four groups.

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num_of_students = input.nextInt();
        System.out.print("Enter the number of groups into which they have to be put: ");
        int num_of_groups = input.nextInt();
        System.out.print("Enter the starting roll number: ");
        int starting_roll_no = input.nextInt();

        int update=starting_roll_no;
        int i,j,num_of_students_in_a_Group=num_of_students / num_of_groups;

        if (num_of_students % num_of_groups == 0) {
            for (i = 1; i <= num_of_groups; i++) {
                System.out.println("Group " + i + ": ");
                for (j = 1; j <= num_of_students_in_a_Group; j++) {
                    System.out.println(starting_roll_no + "\t");
                    starting_roll_no += 4;
                }
                System.out.println();
                starting_roll_no = update + i;
            }
        }
    }
}

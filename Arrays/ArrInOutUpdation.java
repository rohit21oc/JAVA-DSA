package Arrays;

import java.util.Scanner;

public class ArrInOutUpdation {
    public static void main(String[] args) {
        int marks [] = new int [100];

        Scanner in= new Scanner(System.in);
        marks[0] = in.nextInt();
        marks[1] = in.nextInt();
        marks[2] = in.nextInt();

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Math: "+ marks[0]);
        System.out.println("Phy: "+ marks[1]);
        System.out.println("Chem: "+ marks[2]);
        System.out.println("Percentage of marks is "+ percentage + "%");
    }
}

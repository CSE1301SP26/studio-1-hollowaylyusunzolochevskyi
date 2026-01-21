package studio1;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First number?");
        int n1 = input.nextInt();
        System.out.println("Second number?");
        int n2 = input.nextInt();

        double average = (n1+n2)/2.0;
        System.out.println("The average of "+n1+" and "+n2+" is "+average);

    }

}

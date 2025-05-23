package Task_17May;

import java.util.Scanner;

public class Task3_TernaryOperator_FindAge {
    public static void main (String[] args){
//        int age = 25;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        String output = (age>=18 ? (age > 65 ? "Senior" : "Adult") : "Minor");
        System.out.println(output);
    }

}

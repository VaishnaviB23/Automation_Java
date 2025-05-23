package Task_19May;

import java.util.Scanner;

public class Task1_IdentifyTriangle_TernaryOperator {
    public static void main(String[] args){
        System.out.print("Enter angle one: ");
        Scanner sc1 = new Scanner(System.in);
        int a1 = sc1.nextInt();

        System.out.print("Enter angle two: ");
        Scanner sc2 = new Scanner(System.in);
        int a2 = sc2.nextInt();

        System.out.print("Enter angle three: ");
        Scanner sc3 = new Scanner(System.in);
        int a3 = sc3.nextInt();

        String output = (a1+a2+a3 != 180 || a1<=0 || a2<=0 ||a3 <=0) ? "Invalid input" :(a1 == a2) && (a2==a3) ? "Equilateral Triangle" : (a1==a2 || a2==a3 || a3==a1) ? "Isosceles Triangle" : "Scalene Triangle";
        System.out.println(output);

    }
}

package Task_19May;

import java.util.Scanner;

public class Task1_IdentifyTriangle {
    public static void main(String[] args){
        System.out.println("Enter angle one");
        Scanner sc= new Scanner(System.in);
        int angle1 =sc.nextInt();

        System.out.println("Enter angle two");
        Scanner sc2= new Scanner(System.in);
        int angle2 =sc2.nextInt();

        System.out.println("Enter angle three");
        Scanner sc3= new Scanner(System.in);
        int angle3 =sc3.nextInt();

        if(angle1 == angle2 && angle2 == angle3 && angle3==angle1) {
            System.out.println("It is an Equilateral triangle");
        }
        else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3){
            System.out.println("It is an Isoceles triangle");
        }
        else
            System.out.println("It is an Scalene triangle");
    }
}

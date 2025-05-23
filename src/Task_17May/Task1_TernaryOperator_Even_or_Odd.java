package Task_17May;

public class Task1_TernaryOperator_Even_or_Odd {
    public static void main (String[] args){
        int num = 5342;
        String output = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + output + " number");
    }
}

package Task_17May;

public class Task2_TernaryOperator_GreatestNumber {
    public static void main (String[] args){
        int n1 = 2;
        int n2 = 8;
        int n3 = 0;

        int output = (n1>n2) ? (n1 > n3) ? n1 : n3 : ((n2>n3) ? n2 :n3);
        System.out.println(output);
    }
}

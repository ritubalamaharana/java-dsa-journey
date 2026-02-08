package java.conditionals;
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter first number:");
        num1 = n.nextInt();
        System.out.print("Enter second number:");
        num2 = n.nextInt();
        System.out.print("Enter third number:");
        num3 = n.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+ " is largest.");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2+ " is largest.");
        }
        else{
            System.out.println(num3+ " is largest.");
        }
        n.close();
    }
}

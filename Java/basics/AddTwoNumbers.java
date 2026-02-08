import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter furst number:");
        num1 = sc.nextInt();
        System.out.print("Enter second number:");
        num2 = sc.nextInt();
        sum = num1+num2;
        System.out.println("Sum of " +num1+ " and " +num2+ " is " +sum);
        sc.close();
    }    
}

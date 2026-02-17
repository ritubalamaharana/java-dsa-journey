package Java.functions;

import java.util.Scanner;

public class FactorialFunction {
    public static void calculateFactorial(int num){
        if(num<0){
            System.out.print("Invalid number");
            return;
        }
        int factorial = 1;
        for( int i=num; i>=1; i--){
            factorial*=i;
        }
        System.out.print("Factorial of " + num + " is " + factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        calculateFactorial(num);
        sc.close();
    }
}

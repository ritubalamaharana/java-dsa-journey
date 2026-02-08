package DSA.basics;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers:");
        int size = sc.nextInt();
        int sum = 0;
        int numbers[] = new int[size];
        System.out.print("Enter elements:");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
            sum+=numbers[i];
        }
        System.out.print("Sum of the numbers in this array is:" +sum);
        sc.close();
    }
}

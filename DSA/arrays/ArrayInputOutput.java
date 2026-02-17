package DSA.Arrays;
import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter how many numbers:");
        size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.print("Enter numbers:");
        for(int i=0; i<size; i++)
            numbers[i] = sc.nextInt();
        
        System.out.print("The numbers are:");
        for(int i=0; i<size; i++){
            System.out.print(numbers[i]+ " ");
        }
        sc.close();
    }
}

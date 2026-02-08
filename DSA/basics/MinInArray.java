package DSA.basics;
import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the elements:");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the numbers:");
        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        int min = numbers[0];
        for(int i=1; i<size; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.print("Minimum number in this array is: " + min);
        sc.close();
    }
}

package DSA.basics;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter how many numbers:");
        size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.print("Enter numbers:");
        for(int i= 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        int largest = numbers[0];
        for(int i=1; i<size; i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        System.out.print("Largest number in this array is:" +largest);
        sc.close();
    }
}

package DSA.basics;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter numbers:");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the number you find to count occurrence:");
        int number = sc.nextInt();
        int count = 0;
        for(int i=0; i<size; i++){
            if(number==numbers[i]){
                count++;
            }
        }
        System.out.print(number + " is occured " + count + " times.");
        sc.close();
    }
}

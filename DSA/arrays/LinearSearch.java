package DSA.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter how many numbers:");
        size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.print("Enter numbers:");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to find:");
        int x = sc.nextInt();
        int index = -1;
        for(int i=0; i<size; i++){
            if(x==numbers[i]){
                index = i;
                break;
            }
        }
        if(index!=-1){
            System.out.print(x + " is at index " + index);
        }
        else{
            System.out.print(index);
        }
        sc.close();
    }
}

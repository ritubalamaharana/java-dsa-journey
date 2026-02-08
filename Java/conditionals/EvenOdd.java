package java.conditionals;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num;
        System.out.print("Enter a number:");
        num = n.nextInt();
        if(num%2==0){
            System.out.print(num+ " is even.");
        } 
        else{
            System.out.print(num+ " is odd.");
        }
        n.close();
    }
}

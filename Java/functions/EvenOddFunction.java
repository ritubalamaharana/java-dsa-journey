package Java.functions;
import java.util.Scanner;

public class EvenOddFunction {
    public static boolean isEven(int n){
        return n%2==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isEven(num)){
            System.out.print(num + " is even.");
        }
        else{
            System.out.print(num + " is odd.");
        }
        sc.close();
    }
}

package Java.loops;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, rem, newnum=0;
        System.out.print("Enter a number:");
        num = sc.nextInt();
        while(num>0){
            rem = num%10;
            newnum = newnum*10+rem;
            num/=10;
        }
        System.out.println("Reversed number is:" +newnum);
        sc.close();
    }
}

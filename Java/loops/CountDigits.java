package java.loops;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = 0;
        int number = num;
        while(num!=0){
            digit++;
            num/=10;
        }
        System.out.println(number + " is a " + digit + " digit number.");
        sc.close();
    }
}

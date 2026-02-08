package java.loops;
import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, sum = 0;
        System.out.print("Enter endvalue:");
        n = sc.nextInt();
        for(i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println("Sum of 1 to " +n+ " is:" +sum);
        sc.close();
    }
}

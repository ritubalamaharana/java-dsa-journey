package Java.functions;
import java.util.Scanner;

public class ArmstrongCheckFunction {
    public static boolean isArmstrong(int num){
        int num1 = num;
        double digit = 0;
        while(num1!=0){
            digit++;
            num1/=10;
        }
        double NewNum = 0;
        int num2 = num;
        while(num2!=0){
            double rem = num2%10;
            NewNum = NewNum + Math.pow(rem, digit);
            num2/=10;
        }
        if(num==NewNum){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isArmstrong(num)){
            System.out.println(num + " is an armstrong number.");
        } else{
            System.out.println(num + " is not an armstrong number.");
        }
        sc.close();
    }
}

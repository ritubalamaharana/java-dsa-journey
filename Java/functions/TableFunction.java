package Java.functions;
import java.util.Scanner;

public class TableFunction {
    public static int[] multiplicationTable(int n){
        int[] table = new int[10];
        for(int i=1; i<=10; i++){
            table[i-1] = n*i;
        }
        return table;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc. nextInt();
        int[] result = multiplicationTable(num);
        for(int i=0; i<result.length; i++){
            System.out.println(num + " * " + (i+1) + " = " + result[i]);
        }
        sc.close();
    }
}

package java.conditionals;
import java.util.Scanner;

public class CheckAlphabetCase {
    public static void main(String[] args) {
        char ch;
        Scanner c = new Scanner(System.in);
        System.out.print("Enter a character:");
        ch = c.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.print(ch+ " is an uppercase alphabet.");
        }
        else if(ch>='a' && ch<='z'){
            System.out.print(ch+ " is an lowercase alphabet.");
        }
        else{
            System.out.print(ch+ " is not an alphabet.");
        }
        c.close();
    }
}

package DSA.basics;
import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        System.out.print("Enter the character you want to search:");
        char ch = sc.next().charAt(0);
        int index = -1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                index = i;
                break;
            }
        }
        if(index!=-1){
            System.out.print(ch + " found at index " + index);
        }
        else{
            System.out.println(index);
        }
        sc.close();
    }
}

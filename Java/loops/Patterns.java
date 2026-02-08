package java.loops;
public class Patterns {
    public static void pattern1(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(){
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern4(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i=1; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1();
        System.out.println("\n");
        pattern2();
        System.out.println("\n");
        pattern3();
        System.out.println("\n");
        pattern4();
        System.out.println("\n");
        pattern5(5);
    }
}

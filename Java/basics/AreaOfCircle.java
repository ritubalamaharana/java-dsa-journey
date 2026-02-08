import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius;
        double area;
        System.out.print("Enter value of radius:");
        radius = sc.nextFloat();
        area = Math.PI * radius * radius;
        System.out.println("Area of the circle is: " +area);
        sc.close();
    }
}
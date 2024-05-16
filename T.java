import java.util.*;
public class T {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double h = scanner.nextDouble();
        double area = b * h * 0.5;
        System.out.println("The area of the triangle is: " + area);
        scanner.close();
    }
}

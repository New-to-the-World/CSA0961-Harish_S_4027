import java.util.*;
public class S {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double s = scanner.nextDouble();
        double area = s * s;
        System.out.println("The area of the square with side length " + s + " is: " + area);
        scanner.close();
    }
}

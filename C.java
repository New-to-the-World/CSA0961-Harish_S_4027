import java.util.*;
public class C {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = scanner.nextDouble();
        double area = 3.14*r*r;
        System.out.println("The area of the circle with radius " + r + " is: " + area);
        scanner.close();
    }
}

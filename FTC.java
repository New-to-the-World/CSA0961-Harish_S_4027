import java.util.*;
public class FTC{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double Fahrenheit = sc.nextDouble();
        double celsius = (Fahrenheit - 32) / 1.8;
        System.out.println("Temperature in Celsius: " +celsius );
        sc.close();
    }
}

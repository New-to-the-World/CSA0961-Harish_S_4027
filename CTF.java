import java.util.*;
public class CTF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        sc.close();
    }
}

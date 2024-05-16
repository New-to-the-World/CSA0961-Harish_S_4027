import java.util.*;
public class SI{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Years: ");
        double n = sc.nextDouble();
        System.out.print("Enter Interest: ");
        double r = sc.nextDouble();
        double si=(p*n*r)/100;
        System.out.println("Simple Intrest: " +si );
        sc.close();
    }
}

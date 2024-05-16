import java.util.*;
public class QR{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int a = sc.nextInt();
        System.out.print("Enter Divisor: ");
        int b = sc.nextInt();
        int c=a/b;
	int d=a%b;
        System.out.println("Quotient: " +c );
        System.out.println("Remainder: " +d );
        sc.close();
    }
}

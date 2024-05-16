import java.util.*;
public class SWAP{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No1: ");
        double a = sc.nextDouble();
        System.out.print("Enter No2: ");
        double b = sc.nextDouble();
        double c=a;
	a=b;
	b=c;
        System.out.println("No 1: " +a );
        System.out.println("No 2: " +b );
        sc.close();
    }
}

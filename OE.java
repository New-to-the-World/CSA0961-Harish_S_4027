import java.util.*;
public class OE{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NO: ");
        double a = sc.nextDouble();
	if(a%2==0){
		System.out.println("Even: " + a);
	}
	else{
		System.out.println("Odd: " + a);
	}
        sc.close();
    }
}

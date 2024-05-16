import java.util.*;
public class BIG{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NO1: ");
        double a = sc.nextDouble();
        System.out.print("Enter NO2: ");
        double b = sc.nextDouble();
	if(a>b){
		System.out.println("Big: " + a);
	}
	else{
		System.out.println("Big: " + b);
	}
        sc.close();
    }
}

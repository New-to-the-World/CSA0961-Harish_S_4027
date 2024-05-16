import java.util.*;
public class L{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        double a = sc.nextDouble();
	if((a%4==0)&&((a%100!=0)||(a%400==0))){
		System.out.println("Leap");
	}
	else{
		System.out.println("Not");
	}
        sc.close();
    }
}

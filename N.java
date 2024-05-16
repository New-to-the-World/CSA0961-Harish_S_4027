import java.util.*;
public class N{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        double a = sc.nextDouble();
	if(a==0){
		System.out.println("Zero");
	}
	if(a>0){
		System.out.println("+ve");
	}
	if(a<0){
		System.out.println("-ve");
	}
        sc.close();
    }
}

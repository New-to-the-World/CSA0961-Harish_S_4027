import java.util.*;
public class RI{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int a = scanner.nextInt();
        int s=0,n;
	while(a!=0){
		n=a%10;
		s=(s*10)+n;
		a=a/10;
	}
        System.out.println("Rev num: "+s);
        scanner.close();
    }
}

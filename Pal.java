import java.util.*;
public class Pal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int a = scanner.nextInt();
        int s=0,n;
	int b=a;
	while(a!=0){
		n=a%10;
		s=(s*10)+n;
		a=a/10;
	}
	if(b==s){
        	System.out.println("Palindrome");
	}
	else{
        	System.out.println("Not Palindrome");	
	}	
        scanner.close();
    }
}

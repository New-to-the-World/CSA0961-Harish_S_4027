public class FS{
	public static void main(String args[]) {
		int n=5,c,a=0,b=1;
		System.out.print(a+"\n"+b+"\n");		
		for(int i=3;i<=n;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+"\n");		
		}
	}
}
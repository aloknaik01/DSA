package Pattern.pattern;

public class TriIncNum {
public static void main(String[] args) {
	
	System.out.println("Enter no fo Row");
	int n  = new java.util.Scanner(System.in).nextInt();
	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=n-i; j++)
		{
			System.out.print(" ");
		}
		
		for(int k=1; k<=i; k++)
		{
			System.out.print(k);
		}
		
		System.out.println();
	}
}
}

package Pattern.pattern;

public class IncTrisamenum {
public static void main(String[] args) {
	System.out.println("Enter row number");
	int n = new java.util.Scanner(System.in).nextInt();
	
	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++)
		{
			System.out.print(i);
		}
		System.out.println( );
	}
}
}

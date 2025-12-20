package Pattern.pattern;

public class HollowDescTriInvert {
public static void main(String[] args) {
	System.out.println("Enter no of Rows");
	int n  = new java.util.Scanner(System.in).nextInt();
	
	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=n-1; j++)
		{
			
				System.out.print(" ");
		
		}
		
		for(int k=1; k<=i; k++)
		{
			if(k==1 || k==i || i==n)
			System.out.print("*");
			else System.out.print(" ");
		}
		
		System.out.println();
	}
}
}

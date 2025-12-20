package Pattern.pattern;

public class ReverseIncNum {
public static void main(String[] args) {
	System.out.println("Enter no of Rows");
	int n = new java.util.Scanner(System.in).nextInt();
	int p = (n*(n+1)/2);
	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=n-i; j++)
		{
			System.out.print("\t");
		}
		for(int k=i; k>=1; k--)
		{
			System.out.print(p-- + "\t");
		}
		System.out.println();
	}
}
}

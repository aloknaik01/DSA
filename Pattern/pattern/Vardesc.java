package Pattern.pattern;

public class Vardesc {
public static void main(String[] args) {
	
	System.out.println("Entet No of Rows");
	int n = new java.util.Scanner(System.in).nextInt();
	for(int i=n; i>=1; i--)
	{
		
		int k=n;
		for(int j=i; j>=1; j--)
		{
			System.out.print(k + " ");
			k--;
		}
		
		System.out.println();
	}
}
}

package Pattern.pattern;

public class VarInc {
public static void main(String[] args) {
	
	
	System.out.println("Enter no of Rows");
	int n = new java.util.Scanner(System.in).nextInt();
	for(int i=5; i>=1; i--)
	{
		
		int k=1;
		for(int j=i; j>=1; j--)
		{
			System.out.print(k + " ");
			k++;
		}
		System.out.println();
	}
}
}

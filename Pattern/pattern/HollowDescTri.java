package Pattern.pattern;

public class HollowDescTri {
public static void main(String[] args) {
	for(int i=5; i>=1; i--)
	{
		for(int j=i; j>=1; j--)
		{
			if(j==1 || j==i || i==5)
			{
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		
		System.out.println();
	}
}
}

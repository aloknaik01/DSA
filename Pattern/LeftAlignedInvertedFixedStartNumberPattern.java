package Pattern;

public class LeftAlignedInvertedFixedStartNumberPattern {
    public static void main() {

        System.out.println("Enter no of row");
        int n = new java.util.Scanner(System.in).nextInt();
        leftAlignedInvertedFixedStartNumberPattern(n);
    }
    static void leftAlignedInvertedFixedStartNumberPattern(int n)
    {
        for(int i=1; i<=n; i++ )
        {
            for(int j=n; j>=i; j--)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

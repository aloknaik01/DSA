package Pattern;

public class LeftAlignedInvertedSequentialNumberPattern {
    public static void main() {

        System.out.println("Enter no of row");
        int n = new java.util.Scanner(System.in).nextInt();
        leftAlignedInvertedSequentialNumberPattern(n);
    }
static void leftAlignedInvertedSequentialNumberPattern(int n)
{
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print(i);
        }

        System.out.println();
    }
}

}

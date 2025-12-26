package Pattern;

public class RightAlignedIncreasingStarPattern {
    public static void main() {
        System.out.println("Enter no of row");
        int n = new java.util.Scanner(System.in).nextInt();
        rightAlignedIncreasingStarPattern(n);
    }

    static void rightAlignedIncreasingStarPattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

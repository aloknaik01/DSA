package Pattern;

public class HollowSquareWithInnerStarsPattern2 {
    public static void main() {
        System.out.println("Enter no of rows");
        int n  = new java.util.Scanner(System.in).nextInt();
        hollowSquareWithInnerStarsPattern2(n);
    }


    static void hollowSquareWithInnerStarsPattern2(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==1 || j==1 || i==n || j==n || i==j) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

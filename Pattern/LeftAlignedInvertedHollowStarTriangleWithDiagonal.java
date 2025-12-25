package Pattern;

public class LeftAlignedInvertedHollowStarTriangleWithDiagonal {

//    Enter no of Rows
//    5
//        * * * * *
//        *     *
//        *   *
//        * *
//        *

    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        leftAlignedInvertedHollowStarTriangleWithDiagonal(row);
    }

    static void leftAlignedInvertedHollowStarTriangleWithDiagonal(int n)
    {
        for(int i=n; i>=1; i--)
        {
            for(int j=i; j>=1; j--)
            {
                if(i==n || i==1 || j==1 || j==i)
                System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

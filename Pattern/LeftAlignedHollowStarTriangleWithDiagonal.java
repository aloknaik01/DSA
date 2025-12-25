package Pattern;

public class  LeftAlignedHollowStarTriangleWithDiagonal {

//    Enter no of Rows
//     5
//        *
//        * *
//        *   *
//        *     *
//        * * * * *
    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        leftAlignedHollowStarTriangleWithDiagonal(row);
    }


    static void leftAlignedHollowStarTriangleWithDiagonal(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if(i==1 || i==n || j==1 || j==i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

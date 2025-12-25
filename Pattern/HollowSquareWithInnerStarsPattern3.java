package Pattern;

public class HollowSquareWithInnerStarsPattern3
{

//    Enter no fof rows
//       6
//        * * * * * *
//        * *     * *
//        *   * *   *
//        *   * *   *
//        * *     * *
//        * * * * * *


//    Enter no fof rows
//       5
//        * * * * *
//        * *   * *
//        *   *   *
//        * *   * *
//        * * * * *

    static void main()
    {
        System.out.println("Enter no fof rows");
        int n = new java.util.Scanner(System.in).nextInt();
        hollowSquareWithInnerStarsPattern3(n);
    }

    static void hollowSquareWithInnerStarsPattern3(int n)
    {
        for (int i = 1; i <= n; i++)
        {

            for (int j = 1; j <= n; j++)
            {
                if (i == 1 || j == 1 || i == n || j == n || (i + j == (n + 1) || j == i))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}

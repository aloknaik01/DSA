package Pattern;

public class HollowRectangleBorderStarPattern {


//            * * * *
//            *     *
//            *     *
//            * * * *
    public static void main() {
        System.out.println("Enter no of rows");
        int n = new java.util.Scanner(System.in).nextInt();
        hollowRectangleBorderStarPattern(n);
    }


    static void hollowRectangleBorderStarPattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==1 || i==n || j==n || j==1) System.out.print("* ");
                else System.out.print("  ");
            }

            System.out.println();
        }
    }
}

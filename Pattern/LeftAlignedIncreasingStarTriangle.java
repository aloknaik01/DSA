package Pattern;

public class LeftAlignedIncreasingStarTriangle {
    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        leftAlignedIncreasingStarTriangle(row);
    }

    static void leftAlignedIncreasingStarTriangle(int n)
    {
        for(int i=0; i<=n; i++)
        {
           for(int j=1; j<=i; j++)
           {
               System.out.print("* ");
           }
            System.out.println();
        }
    }
}

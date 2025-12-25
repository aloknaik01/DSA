package Pattern;

public class LeftAlignedDecreasingSequentialNumberTriangle {
    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        leftAlignedDecreasingSequentialNumberTriangle(row);
    }

    static void leftAlignedDecreasingSequentialNumberTriangle(int n)
    {
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

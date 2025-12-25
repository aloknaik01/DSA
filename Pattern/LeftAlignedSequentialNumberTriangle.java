package Pattern;

public class LeftAlignedSequentialNumberTriangle {
    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        leftAlignedSequentialNumberTriangle(row);
    }

    static void leftAlignedSequentialNumberTriangle(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

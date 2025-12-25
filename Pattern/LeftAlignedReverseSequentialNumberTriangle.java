package Pattern;

public class LeftAlignedReverseSequentialNumberTriangle {
    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        leftAlignedReverseSequentialNumberTriangle(row);
    }

    static void leftAlignedReverseSequentialNumberTriangle(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

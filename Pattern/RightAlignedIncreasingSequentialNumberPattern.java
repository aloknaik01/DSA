package Pattern;

public class RightAlignedIncreasingSequentialNumberPattern {

    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        rightAlignedIncreasingSequentialNumberPattern(row);
    }

    static void rightAlignedIncreasingSequentialNumberPattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++) System.out.print(" ");
            for(int k=1; k<=i; k++) System.out.print(k);
            System.out.println();
        }

    }
}

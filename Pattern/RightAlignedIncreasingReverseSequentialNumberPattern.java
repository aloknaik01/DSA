package Pattern;

public class RightAlignedIncreasingReverseSequentialNumberPattern {
    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        rightAlignedIncreasingReverseSequentialNumberPattern(row);
    }

    static void rightAlignedIncreasingReverseSequentialNumberPattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++) System.out.print(" ");
            for(int k=i; k>=1; k--) System.out.print(k);
            System.out.println();

        }
    }
}

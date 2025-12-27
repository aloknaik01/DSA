package Pattern;

public class RightShiftedDecreasingStars {
    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        rightShiftedDecreasingStars(row);
    }

    static void rightShiftedDecreasingStars(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i-1;j++ ) System.out.print("  ");
            for(int k=1; k<=n-i; k++) System.out.print("* ");
            System.out.println();
        }
    }
}

package Pattern;

public class RightShiftedHollowTriangle {
    public static void main() {
        System.out.println("Enter no of row");
        int n = new java.util.Scanner(System.in).nextInt();
        rightShiftedHollowTriangle(n);
    }

    static void rightShiftedHollowTriangle(int n)
    {
        for(int i=n; i>=1; i--)
        {
            for(int j=n-i; j>=1; j--) System.out.print("  ");
            for(int k=i; k>=1; k-- ) {
                if(k==1 || i==k || i==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();

        }
    }
}

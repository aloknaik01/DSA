package Pattern;

public class HollowPyramid {
    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        hollowPyramid(row);
    }

    static void hollowPyramid(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++) System.out.print(" ");
            for(int k=1; k<=i; k++)
            {
                if(k==1 || i==n || k==i) System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }
    }
}

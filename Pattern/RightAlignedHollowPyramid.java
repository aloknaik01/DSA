package Pattern;

public class RightAlignedHollowPyramid {
    public static void main() {
        System.out.println("Enter no of row");
        int n = new java.util.Scanner(System.in).nextInt();
        rightAlignedHollowPyramid(n);
    }

    static void rightAlignedHollowPyramid(int n)
    {

        int space = n-1;
        int star = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <=star; k++) {
                if(k==1 || i==n || k==star) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
            space--;
            star+=2;
        }
    }
}

package Pattern;

public class RightAlignedPalindromicPyramid {
    public static void main() {
        System.out.println("Enter no of row");
        int n = new java.util.Scanner(System.in).nextInt();
        rightAlignedPalindromicPyramid(n);
    }

    static  void rightAlignedPalindromicPyramid(int n)
    {

        int space = n-1;
        int star = 1;


        for (int i = 1; i <=n ; i++) {
            int val = 1;
            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= star ; k++) {
                System.out.print(val + " ");
                if(k <=star/2) val++;
                else val--;

            }
            System.out.println();
            space--;
            star+=2;
        }
    }
}

package Pattern;

public class RightAlignedPalindromicNumberPyramid {

//    Enter no of row
//     5
//          1
//        2 1 2
//      3 2 1 2 3
//    4 3 2 1 2 3 4

    public static void main() {
        System.out.println("Enter no of row");
        int n = new java.util.Scanner(System.in).nextInt();
        rightAlignedPalindromicNumberPyramid(n);
    }

    static void rightAlignedPalindromicNumberPyramid(int n)
    {

        int space = n-1;
        int star = 1;
        int val = 1;
        for (int i = 1; i <n ; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star ; k++) {
                System.out.print(val + " ");
                if(k <= star/2) val--;
                else val++;
            }
            System.out.println();
           space--;
           star+=2;
        }


    }
}

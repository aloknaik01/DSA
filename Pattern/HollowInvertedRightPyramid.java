package Pattern;

public class HollowInvertedRightPyramid {

//    Enter no of Rows
//    5
//        * * * * * * * * *
//          *           *
//           *       *
//            *   *
//              *

    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        hollowInvertedRightPyramid(row);
    }

    static void hollowInvertedRightPyramid(int n)
    {
        int space = 0;
        int star = n*2-1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=star ; k++) {
                if(k==1 || i==1||k==star ) System.out.print("* ");
                else System.out.print("  ");
            }

            System.out.println();
            space++;
            star-=2;
        }
    }

}

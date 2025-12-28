package Pattern;

public class InvertedStarPattern {

//    Enter no of Rows
//    5
//        * * * * * * * * *
//          * * * * * * *
//           * * * * *
//             * * *
//               *
    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        invertedStarPattern(row);
    }
    public static void invertedStarPattern(int n)
    {
        int space = 0;
        int star = n*2-1;
        for (int i = n; i >=1 ; i--) {
            for (int j = space; j >=1 ; j--) {
                System.out.print("  ");
            }
            for (int k = star; k >= 1 ; k--) {
                System.out.print("* ");
            }

            System.out.println();
            space++;
            star-=2;
        }

    }
}

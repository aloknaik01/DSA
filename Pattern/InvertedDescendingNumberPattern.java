package Pattern;

public class InvertedDescendingNumberPattern {
//    Enter no of Rows
//    5
//        5 5 5 5 5 5 5 5 5
//          4 4 4 4 4 4 4
//           3 3 3 3 3
//             2 2 2
//               1
    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        invertedDescendingNumberPattern(row);
    }

    static  void invertedDescendingNumberPattern(int n)
    {

        int space = 0;
        int star = n*2-1;

        for (int i = n; i >= 1 ; i--) {
            for (int j = space; j >=1 ; j--) {
                System.out.print("  ");
            }
                for (int k = star; k >= 1 ; k--) {
                    System.out.print(i+ " ");

            }
            System.out.println();
                space++;
                star-=2;
        }
    }
}

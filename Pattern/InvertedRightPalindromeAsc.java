package Pattern;

public class InvertedRightPalindromeAsc {

//    Enter no of Rows
//    5
//        1 2 3 4 5 4 3 2 1
//          1 2 3 4 3 2 1
//           1 2 3 2 1
//             1 2 1
//               1

    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        invertedRightPalindromeAsc(row);
    }

    static void invertedRightPalindromeAsc(int n)
    {
        int space = 0;
        int star = n*2-1;
        for (int i = 1; i <=n ; i++) {
            int val = 1;
            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=star ; k++) {
                if(k<=star/2)
                {
                    System.out.print(val + " ");
                    val++;
                }
                else {
                    System.out.print(val + " ");
                    val--;
                }
            }

            System.out.println();
            space++;
            star-=2;
        }
    }
}

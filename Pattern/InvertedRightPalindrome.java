package Pattern;

public class InvertedRightPalindrome {
    //      Enter no of Rows
//      5
//       5 4 3 2 1 2 3 4 5
//         4 3 2 1 2 3 4
//           3 2 1 2 3
//            2 1 2
//              1
    public static void main() {
            System.out.println("Enter no of Rows");
            int row = new java.util.Scanner(System.in).nextInt();
        invertedRightPalindrome(row);
        }

        static  void invertedRightPalindrome(int n)
        {

            int space = 0;
            int star = n*2-1;

            for (int i = 1; i <= n ; i++) {
              int val = n-i+1;
                for (int j = 1; j <=space ; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= star ; k++) {
                   if(k <= star/2) {
                       System.out.print(val + " ");
                       val--;
                   }
                   else {
                       System.out.print(val + " ");
                       val++;
                   }

                }
                System.out.println();
                space++;
                star-=2;
            }
        }
    }



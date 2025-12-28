package Pattern;

public class InvertedNumberPattern {

//           1 1 1 1 1 1 1 1 1
//             2 2 2 2 2 2 2
//              3 3 3 3 3
//               4 4 4
//                 5
    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        invertedNumberPattern(row);
    }

    static void invertedNumberPattern(int n)
    {
        int space = 0;
        int star = n*2-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space ; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=star ; k++) {
                System.out.print(i + " ");

            }
            System.out.println();
            space++;
            star-=2;




        }
    }
}

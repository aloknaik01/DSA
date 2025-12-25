package Pattern;

public class RowWiseSequentialNumberIncreasedSquarePattern {
//        1  2  3  4  5
//        6  7  8  9  10
//        11 12 13 14 15
//        16 17 18 19 20
//        21 22 23 24 25
    public static void main() {
        System.out.println("Enter a number of row");
        int n = new java.util.Scanner(System.in).nextInt();
        rowWiseSequentialNumberIncreasedSquarePattern(n);
    }

    static void rowWiseSequentialNumberIncreasedSquarePattern(int n)
    {
        int val = 1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print(val);
                if ((val <= 9)) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
                val++;
            }
            System.out.println();
        }
    }

}

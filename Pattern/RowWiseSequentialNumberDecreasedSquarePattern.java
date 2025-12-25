package Pattern;

public class RowWiseSequentialNumberDecreasedSquarePattern {
    static void main() {
        System.out.println("Enter no of row");
        int n = new java.util.Scanner(System.in).nextInt();
        rowWiseSequentialNumberDecreasedSquarePattern(n);
    }

    static void rowWiseSequentialNumberDecreasedSquarePattern(int n)
    {
        int val = n*n;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print(val);
                if(val <=9) System.out.print("  ");
                else System.out.print(" ");
                val--;
            }
            System.out.println();
        }
    }
}

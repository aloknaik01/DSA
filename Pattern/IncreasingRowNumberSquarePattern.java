package Pattern;

public class IncreasingRowNumberSquarePattern {


//            1 1 1 1 1
//            2 2 2 2 2
//            3 3 3 3 3
//            4 4 4 4 4
//            5 5 5 5 5


    public static void main() {
        System.out.println("Enter no of Row");
        int n = new java.util.Scanner(System.in).nextInt();
        increasingRowNumberSquarePattern(n);
    }

    static void increasingRowNumberSquarePattern(int n)
    {
        int col = n;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=col; j++)
            {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}

package Pattern;

public class SquareStarPattern {
    public static void main() {

        System.out.println("Enter no of row");
        int n = new java.util.Scanner(System.in).nextInt();
              star(n);
    }

    static void star(int row)
    {
        int col = row;
        for(int i=1; i<=row; i++)
        {
            for(int j=1; j<=col; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package Pattern;

public class LeftAlignedIncreasingNumberTriangle {
//    Enter no of Rows
//    5
//            1
//            22
//            333
//            4444
//            55555

    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        leftAlignedIncreasingNumberTriangle(row);
    }

    static void leftAlignedIncreasingNumberTriangle(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}

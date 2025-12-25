package Pattern;

public class LeftAlignedDecreasingReverseNumberTriangle {

//    Enter no of Rows
//    5
//        5 4 3 2 1
//        4 3 2 1
//        3 2 1
//        2 1
//        1

    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        leftAlignedDecreasingReverseNumberTriangle(row);
    }

    static void leftAlignedDecreasingReverseNumberTriangle (int n)
    {
        for(int i=n; i>=1; i--)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

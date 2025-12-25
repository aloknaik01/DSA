package Pattern;

public class LeftAlignedDecreasingStarTriangle {

//    Enter no of Rows
//    5
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        leftAlignedDecreasingStarTriangle(row);
    }

    static void leftAlignedDecreasingStarTriangle(int n)
    {
        for(int i=n; i>=1; i--)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

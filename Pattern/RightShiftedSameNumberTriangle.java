package Pattern;

public class RightShiftedSameNumberTriangle {

//    Enter no of Rows
//    5
//        5 5 5 5 5
//        4 4 4 4
//        3 3 3
//        2 2
//        1

    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        rightShiftedSameNumberTriangle(row);
    }

    public static void rightShiftedSameNumberTriangle(int n)
    {
        for(int i=n; i>=1; i--)
        {
            for(int j=n-i; j>=1; j--) System.out.print("  ");
            for(int k=i; k>=1; k--) System.out.print(i  + " ");
            System.out.println();
        }
    }
}

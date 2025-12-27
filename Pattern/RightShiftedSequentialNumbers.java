package Pattern;

public class RightShiftedSequentialNumbers {
//
//    Enter no of Rows
//    5
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        rightShiftedSequentialNumbers(row);
    }

    static void rightShiftedSequentialNumbers(int n)
    {
        for(int i=n; i>=1; i--)
        {
            for(int j=n-i; j>=1; j--) System.out.print("  ");
            for(int k=1; k<=i; k++) System.out.print(k + " ");
            System.out.println();
        }
    }
}

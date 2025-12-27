package Pattern;

public class RightShiftedReverseNumbers {

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
        rightShiftedReverseNumbers(row);
    }

    public static void rightShiftedReverseNumbers(int n)
    {
        for(int i=n; i>=1; i--)
        {
            for(int j=n-i; j>=1; j--) System.out.print("  ");
            for(int k=i; k>=1; k--) System.out.print(k + " ");
            System.out.println();
        }
    }


}

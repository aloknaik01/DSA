package Pattern;

public class RightShiftedFixedReverseNumbers {

//    Enter no of Rows
//    5
//        5 4 3 2 1
//        5 4 3 2
//        5 4 3
//        5 4
//        5

        public static void main() {
            System.out.println("Enter no of Rows");
            int row = new java.util.Scanner(System.in).nextInt();
            rightShiftedFixedReverseNumbers(row);

    }

    static void rightShiftedFixedReverseNumbers(int n)
    {
        for(int i=n; i>=1; i--)
        {
            for(int j=n-i; j>=1; j--) System.out.print("  ");
            for(int k=n; k>n-i; k--) System.out.print(k + " ");
            System.out.println();
        }
    }
}

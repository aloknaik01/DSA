package Pattern;

public class RightShiftedReverseContinuousNumbers {
//    Enter no of row
//     5
//        15  14  13  12  11
//               10  9  8  7
//                   6  5  4
//                      3  2
//                         1

    static void main() {
        System.out.println("Enter no of row");
        int n = new java.util.Scanner(System.in).nextInt();
        rightShiftedReverseContinuousNumbers(n);
    }

    static void rightShiftedReverseContinuousNumbers(int n)
    {
        int val = (n * (n+1)/2);
        for (int i = n; i >=1 ; i--) {
            for (int j = n-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >=1;k--) {
               if(k<=9)  System.out.print(val-- + "  ");
               else System.out.print(val-- + " ");
            }
            System.out.println();
        }
    }
}

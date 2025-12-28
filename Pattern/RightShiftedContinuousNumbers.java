package Pattern;

public class RightShiftedContinuousNumbers {

//    Enter no of row
//     5
//        1  2  3  4  5
//           6  7  8  9
//           10  11  12
//               13  14
//                   15
    static int val = 1;
    static void main() {
        System.out.println("Enter no of row");
        int n = new java.util.Scanner(System.in).nextInt();
        rightShiftedContinuousNumbers(n);
    }

  public static void rightShiftedContinuousNumbers(int n)
    {
     for(int i=n; i>=1; i--)
{
    for(int j=n-i; j>=1; j--) System.out.print(" ");
    for(int k=i; k>=1; k--) {
        if(val <= 9) System.out.print(val++ + " ");
        else System.out.print(val++ + " ");
    }
    System.out.println();
}
    }
}

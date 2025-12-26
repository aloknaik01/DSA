package Pattern;

public class RightAlignedIncreasingRepeatedNumberPattern {

//    Enter no of row
//    5
//        1
//        22
//        333
//        4444
//        55555

    public static void main() {
        System.out.println("Enter no of row");
        int n = new java.util.Scanner(System.in).nextInt();
        rightAlignedIncreasingRepeatedNumberPattern(n);
    }

    static void rightAlignedIncreasingRepeatedNumberPattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++) System.out.print(" ");
            for(int k=1; k<=i; k++) System.out.print(i);


            System.out.println();
        }


    }
}

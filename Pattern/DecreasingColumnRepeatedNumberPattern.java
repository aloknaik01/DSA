package Pattern;

public class DecreasingColumnRepeatedNumberPattern {

//    Enter no of row
//    5
//        11111
//        2222
//        333
//        44
//        5

    public static void main() {
        System.out.println("Enter no of row");
        int n = new java.util.Scanner(System.in).nextInt();
        decreasingColumnRepeatedNumberPattern (n);
    }

    static void decreasingColumnRepeatedNumberPattern(int n)
    {
    for(int i=1; i<=n; i++)
    {
          int val = n;
        for(int j=i; j<=val; j++)
        {
            System.out.print(i);

        }
            val--;
        System.out.println();
    }
    }
}

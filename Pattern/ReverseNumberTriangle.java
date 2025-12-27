package Pattern;

public class ReverseNumberTriangle {
    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        reverseNumberTriangle(row);
    }

    public static void reverseNumberTriangle(int n)
    {

        int val = n * (n+1) / 2;
        for(int i=1; i<=n; i++)
        {


            for(int j=1; j<n-i; j++) System.out.print(" ");
            for(int k=1; k<=i; k++)
            {
                System.out.print(val--);
            }
            System.out.println();
        }
    }
}

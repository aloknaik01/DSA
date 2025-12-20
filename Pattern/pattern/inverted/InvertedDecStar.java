package Pattern.pattern.inverted;

public class InvertedDecStar {
    static void main() {

        System.out.println("Enter no of rows");
        int n = new java.util.Scanner(System.in).nextInt();
        int start = n*2-1;
        int space = 0;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=start; k++)
            {
                System.out.print("*");
            }

            System.out.println();
            space ++;
            start-=2;
        }
    }
}

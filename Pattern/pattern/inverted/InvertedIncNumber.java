package Pattern.pattern.inverted;

public class InvertedIncNumber {
    public static void main() {
        System.out.println("Enter no of Rows");
        int n = new java.util.Scanner(System.in).nextInt();
        int space = 0;
        int star = n * 2 -1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }

            for(int k=1; k<=star; k++)
                System.out.print(i);


            System.out.println();
            space++;
            star-=2;
        }
    }
}

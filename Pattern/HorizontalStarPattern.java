package Pattern;

public class HorizontalStarPattern {
   public  static void main() {

       System.out.println("Enter  a number");
       int n = new java.util.Scanner(System.in).nextInt();
       horizontalStarPattern(n);
    }

    static void horizontalStarPattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            System.out.print("* ");
        }

    }
}

package Pattern.pattern.inverted;

public class IncDecNumInverted {
   public static void main() {
       System.out.println("Enter a no of rows");
       int n  = new java.util.Scanner(System.in).nextInt();

       int space = 0;
       int start = n * 2 - 1;

       for(int i=1; i<=n; i++)
       {
           int val = 1;
           for(int j=1; j<=space; j++)
           {
               System.out.print(" ");
           }

           for(int k=1; k<=start; k++)
           {
            if(k<=start/2 )
            {
                System.out.print(val);
                val++;
            }
            else {
                System.out.print(val);
                val--;
            }

           }

           System.out.println();
           space++;
           start-=2;
       }
    }
}

package Pattern.pattern.inverted;

//
//        *********
//         *     *
//          *   *
//           * *
//            *

public class HollowINvertedIncStar {
    public static void main() {
        System.out.println("Enter no of rows");
        int n = new java.util.Scanner(System.in).nextInt();

        int space = 0;
        int star = n * 2 -1;

        for(int i=1; i<=n; i++)
        {
            for( int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }

            for(int k=1; k<=star; k++)
            {
                if(i==1 || k == 1 || k==star)
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
            space++;
            star-=2;
        }
    }
}

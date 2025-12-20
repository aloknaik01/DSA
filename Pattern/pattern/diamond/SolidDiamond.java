package Pattern.pattern.diamond;

public class SolidDiamond {
    public static void main() {
        System.out.println("Enter no of rows");
        int n = new java.util.Scanner(System.in).nextInt();

        int space =  n/2;
        int star = 1;

        if(n%2==0) n+=1;


        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=star; k++)
            {
                System.out.print("*");
            }

            System.out.println();
            if(i<=n/2) {
                space--;
                star+=2;
            }
            else {
                space++;
                star-=2;
            }
        }
    }
}

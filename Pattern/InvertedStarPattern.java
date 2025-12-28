package Pattern;

public class InvertedStarPattern {
    public static void main() {
        System.out.println("Enter no of Rows");
        int row = new java.util.Scanner(System.in).nextInt();
        invertedStarPattern(row);
    }
    public static void invertedStarPattern(int n)
    {
        int space = 0;
        int star = n*2-1;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=space ; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=star ; k++) {
                System.out.print("* ");
            }
            System.out.println();
            space++;
            star-=2;
        }

    }
}

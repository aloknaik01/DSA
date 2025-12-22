package Arrays;

import java.util.Arrays;

public class DescNArray {
    static void main() {
        System.out.println("Enter a numebr");
        int n = new java.util.Scanner(System.in).nextInt();
        int res[] = descbuild(n);
        System.out.println(Arrays.toString(res));
    }


    static int[] descbuild(int n )
    {
        int[] a = new int[n];
        for(int i=0; i<a.length; i++)
        {
            a[i] = n--;
        }

        return a;
    }


}

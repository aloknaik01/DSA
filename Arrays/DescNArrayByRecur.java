package Arrays;

import java.util.Arrays;

public class DescNArrayByRecur {
    public static void main() {
        System.out.println("Enter array size");
        int n  = new java.util.Scanner(System.in).nextInt();
        int arr[] = new int[n];
        int res[] = incNArrayByRecur(arr, 0, n);
        System.out.println(Arrays.toString(res));
    }

    static int[] incNArrayByRecur(int a[], int index, int n){

        if(index > a.length-1) return a;
        a[index] = n;
        return incNArrayByRecur(a, ++index,--n);
    }
}

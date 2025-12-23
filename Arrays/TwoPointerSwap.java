package Arrays;

import java.util.Arrays;

public class TwoPointerSwap {
    public static void main() {
    int arr[] = { 2, 5, 6, 3, 8, 6 };
    int i=0;
    int j= arr.length -1;
    int res[] = twoPointer(arr,i,j);
        System.out.println(Arrays.toString(res));

    }

    static int[] twoPointer(int a[], int i, int j)
    {
        if(i>j) return a;
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return twoPointer(a, ++i, --j);
    }
}

package Arrays;

import java.util.Arrays;

public class ArrayReverse {
    public static void main() {
        int arr[] = {2 ,2 ,5 ,5 ,6 ,3 ,6 ,6};
int res[] =  rev(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(res));
    }

    static int[] rev(int a[], int start, int end)
    {
        if(start < 0) return a;
        if(end >= a.length) return a;
        while(start <= end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }

        return a;
    }
}

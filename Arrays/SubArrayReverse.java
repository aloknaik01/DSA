package Arrays;

import java.util.Arrays;

public class SubArrayReverse {
    public static void main() {
        int arr[] = {2 , 4, 6, 1, 0, 5, 6};
        subArrayReverse(arr, 0, 3);
    }


    static void subArray(int []a, int i, int j)
    {
        if(i<0) return;
        if(j>=a.length) return;;
    }

    static void subArrayReverse(int []a, int i, int j)
    {
        if(i<0) return;
        if(j>=a.length) return;
        if(i>j) return;

        while (i <= j)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(a));
    }
}

package Arrays.Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
     int arr[] = {3, 5, 6, 7 ,2, 6};
      int res[] = bubbleSort(arr);
      int res2[] = bubbleSortDesc(arr);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res2));
    }

    static int[] bubbleSort(int a[])
    {
        for(int i=0; i<a.length-1; i++)
        {
            boolean isSwap = true;
            for(int j=0; j<a.length-1-i; j++)
            {

                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    isSwap = false;
                }
            }
            if(isSwap) break;
        }

       return a;

    }

    static int[] bubbleSortDesc(int a[])
    {
        for(int i=0; i<a.length-1; i++)
        {
            boolean isSwap = true;
            for(int j=0; j<a.length-1-i; j++)
            {

                if(a[j] < a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    isSwap = false;
                }
            }
            if(isSwap) break;
        }

        return a;

    }
}

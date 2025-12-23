package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main() {
        int arr[] = { 1,2,3,4};
        int Loopres[] = reverseByLoop(arr);
        System.out.println(Arrays.toString(Loopres));

        int swapLoopRes[] = reversebySwapByLoop(arr);
        System.out.println(Arrays.toString(swapLoopRes));

    }


    //Reverse Array By Loop
    static int[] reverseByLoop(int []a)
    {
        int i  = a.length-1;
        int b[] = new int[a.length];
        while(i >= 0)
        {
            b[i] = a[(a.length-1) - i];
            i--;
        }

        return b;
    }

    //Reverse Array By Swap through Loop
    static int[] reversebySwapByLoop(int currentArray[])
    {
        int i = 0;
        int j = currentArray.length - 1;

        while (i < j)
        {
         int temp = currentArray[i];
         currentArray[i] = currentArray[j];
         currentArray[j] = temp;
         i++;
         j--;
        }
        return currentArray;

    }


}

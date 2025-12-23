package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main() {
        int arr[] = { 9, 4, 6, 3, 7,4,6,63,0,43,64,73};
        int Loopres[] = reverseByLoop(arr);
        System.out.println(Arrays.toString(Loopres));

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
}

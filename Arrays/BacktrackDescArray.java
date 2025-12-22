package Arrays;

import java.util.Arrays;

public class BacktrackDescArray {
    static void main() {
        int arr[] = {1,2,3,4,5};
        backtrackDescArray(arr, 0);
    }

    static void backtrackDescArray(int arr[], int start)
    {


        if(arr.length == start) return;
        backtrackDescArray(arr, start+1);
        System.out.println(arr[start]);

    }
}

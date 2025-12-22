package Arrays;

public class BacktrackIncArray {
   public static void main() {
        int arr[] = {1,2,3,4,5};
        backTrackincArray(arr, 0);
    }


    static void backTrackincArray(int arr[], int start)
    {
        if(arr.length == start)  return;
        System.out.println(arr[start]);
        backTrackincArray(arr, start+1);
    }
}

package Arrays;

public class FinMaxInRecur {
    public static void main() {

        int arr[] = {2, 4 ,5 ,6 , 5 ,8};
        int val = Integer.MIN_VALUE;
        int res = findMax(arr,  val, 0);
        System.out.println(res);
    }

    static int findMax(int arr[], int max, int index)
    {
        if(arr.length == 0) throw new RuntimeException("Empty Array");
        if(index == arr.length) return  max;
        if(max < arr[index])  max = arr[index];
        return findMax(arr, max, index + 1);
     }

}

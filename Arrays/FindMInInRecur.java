package Arrays;

public class FindMInInRecur {
    public static void main() {
        int arr[] = {1 ,2 ,3 ,4 ,5 ,5 ,6};
        int min = Integer.MAX_VALUE;
        int res = findMin(arr, min, 0);
        System.out.println(res);
    }

    static int findMin(int arr[], int min, int index)
    {
        if(arr.length == 0) throw new RuntimeException("Empty Array");
        if(arr.length == index) return min;

        if(min > arr[index]) min = arr[index];
        return findMin(arr, min, ++index);
    }
}

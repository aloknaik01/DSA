package Arrays;

public class FindMax {
    public static void main() {

        int arr[] = { 1, 6,3 ,5 ,33, 99, 0};
 int res = findMax(arr);
        System.out.println(res);
    }

    static int findMax(int arr[]) throws RuntimeException
    {
        if(arr.length == 0) throw new RuntimeException("Empty Array");

        int max = Integer.MIN_VALUE;
        for(int a:arr )
        {
            if(a > max) max=a;
        }

        return max;
    }
}

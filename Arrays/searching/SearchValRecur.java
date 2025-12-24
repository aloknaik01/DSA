package Arrays.searching;

public class SearchValRecur {
    public static void main() {
        int arr[] = {1,2 ,3 ,4 ,5};
        System.out.println("Enter a valid Number");
        int val = new java.util.Scanner(System.in).nextInt();

        int res = searchValRecur(arr,0, val);
        System.out.println(res);

    }

    static int searchValRecur(int arr[], int index, int val)
    {
        if(arr.length == 0) throw new RuntimeException("Empty Array");
        if(arr.length == index) return -1;

        if(arr[index] == val) return index;
        return searchValRecur(arr, ++index, val);
    }
}

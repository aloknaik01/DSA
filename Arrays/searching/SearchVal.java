package Arrays.searching;

public class SearchVal {
    static void main()
    {
        int arr[] = {1 ,2 ,3 ,4 ,5};
        int res = searchVal(arr, 3);
        System.out.println(res);
    }

    static int searchVal(int arr[], int val)
    {
        for(int i=0; i< arr.length ; i++)
        {
            if(arr[i] == val) return i;
        }

        return -1;
    }
}

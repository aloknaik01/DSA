package Arrays;

public class CustomArray {
    public static void main() {
        int arr[] = {1,2,3,4,5,6,7};
        int row = 7;
        int col = 5;
        int index = 0;
        customArray(arr, row, col, index);
    }

    static void customArray(int[]a, int row, int col, int index)
    {
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(a[index%a.length]);
                index++;
            }
            System.out.println();
        }
    }
}

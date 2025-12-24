package Arrays;

public class FindMIn {
   public static void main() {

        int arr[] = {0 ,3 ,4 , 6 ,7};
      int res =  findmin(arr);
        System.out.println(res);
    }


static   int findmin(int arr[]) {
        if (arr.length == 0) throw new RuntimeException("Empty Array");
        int min = Integer.MAX_VALUE;

        for (int a : arr) {
            if (a < min) min = a;
        }
        return min;
    }
}
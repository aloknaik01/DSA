package Arrays;

public class FindMissingEle {
  public  static void main() {

        int arr[] = {12,11,14,16,13,15};
        int res = findMissingEle(arr);
        System.out.println(res);
    }

    static int findMissingEle(int a[])
    {
        int actual = 0;
        int max = Integer.MIN_VALUE;
        for(int e: a)
        {
            actual+=e;
            if(e > max) max = e;
        }

        int missingNO = ((max*(max+1))/2) - actual;
        return missingNO;
    }



}

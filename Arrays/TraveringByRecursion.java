package Arrays;

public class TraveringByRecursion {

    static int[] arr = {2, 3, 7,6 ,2,6};
    static void main() {
        treverse(arr, 0);
    }

    static void treverse(int a[], int start)
    {
        if(start == a.length) return ;
        System.out.println(a[start]);
        treverse(a, ++start);
    }

}

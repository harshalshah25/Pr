import java.util.*;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr={12,3,5,6,8,9};

        System.out.println(Arrays.toString(bubble(arr, 0)));
    }

    static int[] bubble(int[] arr,int n){
        if(n==arr.length-1){
            return arr;
        }

        for(int i = n; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        return bubble(arr, n+1);
       
    }
}

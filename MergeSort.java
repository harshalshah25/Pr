import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length==1){
                return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] rigth = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return sort(left,rigth);
    }


    private static int[] sort(int[] first, int[] last){
        int[] mix = new int[first.length+last.length];
        int i =0;
        int j =0;
        int k =0;


        while(i<first.length && j<last.length){
            if(first[i]<last[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = last[j];
                j++;
            }

            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<last.length){
            mix[k]=last[j];
            j++;
            k++;
        }

        return mix;

    }
}

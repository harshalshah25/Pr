public class InPlaceMergeSort {
    public static void main(String[] args) {
        
    }

    static void sort(int[] arr, int s, int e){
        if(arr.length==1){
            return;
        }

        int m = s+(e-s)/2;

        sort(arr,s,m);
        sort(arr,m,e);

   


    }
    private static int[] sorting(int[] first, int[] last){
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

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
    
}

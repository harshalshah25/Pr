
public class Searching {
    public static void main(String[] args){

        int[] arr={1,2,3,4,6};
        int target=6;

        System.out.println(binary(arr,target));



    }

    static int binary(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+end/2;
            if(mid==target){
                return mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            if(arr[mid]<target){
                start=mid+1;
            }

        }

        return (arr[start]);
    }
}

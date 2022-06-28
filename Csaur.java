public class Csaur {
    public static void main(String[] args) {
        int[] arr={1,2,3,9,5,6,7,8};
        int n=0;

        System.out.println(checker(arr, n));
    }
    static boolean checker(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]<arr[i+1]){
            return checker(arr,i+1);
        }
        return false;
    }
}

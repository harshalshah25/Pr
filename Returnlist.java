import java.util.ArrayList;

public class Returnlist {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,8};

     System.out.println(index(arr, 4, 0));

    }

    static ArrayList<Integer> index(int[] arr,int target,int index){
        ArrayList<Integer> list= new ArrayList<>();

        if(index==arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> belowans = index(arr, target, index);

        list.addAll(belowans);

        return list;
    }
}

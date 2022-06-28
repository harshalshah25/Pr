import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] numbers={0,0,11,6};
        int target =0;



        System.out.print(hello(numbers,target));
    }

    static int[] hello(int[] numbers,int target){
        int[] ans=new int[2];
        for(int i =0;i<=numbers.length-1;i++){
            int j=0;
            while(j<=numbers.length-1){
                if(numbers[i]+numbers[j]==target){
                    ans[0]=i+1;
                    ans[1]=j+1;
                    return ans;
                }else{
                    j++;
                }
            }

        }
        return ans;


    }
}

import java.util.Arrays;

public class FirstAndLastOccurenceInString {
    public static void main(String[] args) {
        int[] arr= new int[2];
        String p="abaacdaefaah";
        int s= 0;
        int e=p.length()-1;
        char t='a';

        occur(arr, p, s, e, t);
    }

    static int[] occur(int[] arr,String p,int s,int e,char t){
        if(s<=e){
         
           return new int[s,e];
        }
        
        char start = p.charAt(s);
        char end = p.charAt(e);

        if(start==t){
            arr[0]=start;
        }
        if(end==t){
            arr[1]=end;
        }

        occur(arr, p, s+1, e-1, t);

        
    }
}

import java.util.*;
public class CyclicSort{
    public static void main(String args[]){
        int[] a = {3,1,3,3,2};
        int size =5;


        Arrays.sort(a);
            int count=1;
            int ans=0;
            int i = 1;
        while(i<a.length){
            
            if(a[i]==a[i-1]){
                ans=a[i];
            }
            
            else{
                i++;
            }
           
        }
        
        if(count>size/2){
            System.out.println(ans);
        }
        
        else{
            System.out.println(-1);
        }
    }


        
        
       
}
 

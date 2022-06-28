public class CountSteps {
    public static void main(String[] args) {
        int n=8;
        System.out.println(count(n));
    }

    static int count(int n){

        return steps(n,0);

    }

    static int steps(int n,int step){
        if(n==0){
            return step;
        }
        if(n%2==0){
            return steps(n/2,step+1);
        }
        return steps(n-1,step+1);

    }
}

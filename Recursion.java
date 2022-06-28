public class Recursion {
    public static void main(String[] args) {
        num(1);
    }

    static void num(int n){
        if(n==6){
            return;
        }

        System.out.println(n);
        n++;
        num(n);

    }
}

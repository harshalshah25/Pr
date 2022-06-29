public class Palindrome {
    public static void main(String[] args) {
        int n = 1234321;
        String str = Integer.toString(n);

        int s=0;
        int e=str.length()-1;

        System.out.println(pali(str,s,e));
    }

    static boolean pali(String str,int s,int e){
        if(s>=e){
            return true;
        }

        char ch = str.charAt(s);
        char che = str.charAt(e);

        if(ch==che){
            return pali(str, s+1, e-1);
        }else{
            return false;
        }

    }
}

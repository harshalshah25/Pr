public class PrintStack {
    public static void main(String[] args) {
        CustomStack stk = new CustomStack(5);
        stk.push(5);
        stk.push(4);

//        System.out.println(stk.pop());
//        System.out.println(stk.pop());
        System.out.println(stk.peek());

    }
}

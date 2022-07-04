public class CustomStack{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data =new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    protected boolean isFull() {
            return ptr == data.length-1;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int remove = data[ptr];
        ptr--;
        return remove;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return data[ptr];
    }

    protected boolean isEmpty() {
        return ptr == -1;
    }


}

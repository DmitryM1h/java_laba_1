public class container {
    private int[] A;
    private int size = 0;
    private int capacity = 50;
    container(){
        A = new int[50];
    }
    void add(int el){
        A[size] = el;
        ++size;
        if (size==capacity)
                resize();

    }
    void resize(){}

    int get(int id){
        if (id >= size)
            throw new IllegalArgumentException("Out of array's bounds");

        return A[id];
    }
}

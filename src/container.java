public class container {
    private int[] A;
    private int size = 0;
    private int capacity = 5;
    container(){
        A = new int[capacity];
    }
    void add(int el){
        A[size] = el;
        ++size;
        if (size==capacity)
                resize();

    }
    void resize(){
        this.capacity = 2 * this.capacity;
        int[] A = new int[this.capacity];
        System.arraycopy(this.A, 0, A, 0, size);
        this.A = A;
    }

    int get_element(int ind){
        if (ind >= size)
            throw new IllegalArgumentException("Out of array's bounds");

        return A[ind];
    }
    int getCapacity() {return this.capacity;}

    int getSize() {return this.size;}

    @Override
    public String toString(){
        String str = "";
        for(int i=0;i<size;i++)
            str = str.concat(Integer.toString(A[i])).concat(" ");
        return str;
    }
}

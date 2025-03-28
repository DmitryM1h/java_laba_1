public class container {
    private int[] A;
    private int size = 0;
    private int capacity;
    container(){
        this.capacity = 50;
        A = new int[capacity];
    }
    container(int capacity){
        this.capacity = capacity;
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

    void delete(int ind){
        if (ind < 0 || ind >= size)
            throw new IllegalArgumentException("Index out of bounds");
        for(int i=ind;i<size-1;i++)
            A[i] = A[i+1];
        --size;
    }

    @Override
    public String toString(){
        String str = "";
        if (size==0)
            str = "empty";
        else
            for(int i=0;i<size;i++)
                str = str.concat(Integer.toString(A[i])).concat(" ");
        str = str.concat("\nsize: ").concat(Integer.toString(size)).concat("\n");
        str = str.concat("capacity: ").concat(Integer.toString(capacity));
        return str;
    }
}

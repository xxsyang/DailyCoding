class DynamicArray {

    int[] arr = new int[8];
    int size = 0;
    int capacity = 8;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if(this.size >= this.capacity){
            resize();
        }
        this.size = size + 1;
//        if(this.size >= this.capacity){
//            resize();
//        }
        if(this.size == 1){
            this.arr[0] = n;
        }
        else{
            this.arr[size - 1] = n;
        }

    }

    public int popback() {
       int res = this.arr[this.size - 1];
       this.size = this.size - 1;
       return res;
    }

    private void resize() {
        int newCapacity = this.capacity * 2;
        int[] newArr = new int[newCapacity];

        for(int i = 0; i < this.size; i++){
            newArr[i] = arr[i];
        }
        this.arr = newArr;
        this.capacity = newCapacity;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}




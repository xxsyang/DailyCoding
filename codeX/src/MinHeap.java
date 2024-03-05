import java.util.ArrayList;
import java.util.List;

class MinHeap {

    private List<Integer> heap;
    private int size;

    public MinHeap() {
        this.heap = new ArrayList<>();
        heap.add(0);
        this.size = 0;
    }

    public void push(int val) {
        heap.add(val);
        this.size++;
        int index = this.size;

        while(heap.get(index) < heap.get(index / 2) && index > 1){
            int current = heap.get(index);
            int currentParent = heap.get(index / 2);
            heap.set(index, currentParent);
            heap.set(index / 2, current);
            index = index / 2;
        }
    }

    private void heapifyUp() {
    }

    public int getSize() {
        return this.size;
    }

    public Integer pop() {
        return 0;
    }

    public Integer top() {
        return 0;
    }

    public void heapify(List<Integer> nums) {

    }
}

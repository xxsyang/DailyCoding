import java.util.ArrayList;

class LinkedList<N> {
    class node {
        int item;
        node next;
        public node(int num) {
            this.item = num;
            this.next = null;
        }
    }

    node head;
    int size;

    public LinkedList() {
        this.head = new node(-1);
        this.size = 0;
    }

    public int get(int index) {
        node temp = head.next;
        int count = 0;

        if(index < 0 || index >= this.size){
            return -1;
        }

        if(index == 0){
            return temp.item;
        }

        while(temp != null){
            temp = temp.next;
            count++;
            if(count == index){
                break;
            }
        }
        return temp.item;
    }

    public void insertHead(int val) {
        node add = new node(val);

        if(this.size == 0){
            add.item = val;
            add.next = null;
            head.next = add;
            this.size++;
            return;
        }

        node temp = head.next;
        add.item = val;
        add.next = temp;
        head.next = add;

        this.size++;
    }

    public void insertTail(int val) {
        node add = new node(val);

        if(this.size == 0){
            add.item = val;
            add.next = null;
            head.next = add;
            this.size++;
            return;
        }

        node temp = this.head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = add;
        add.item = val;
        add.next = null;
        this.size++;

    }

    public boolean remove(int index) {
        if(index < 0 || index > size - 1){
            return false;
        }
        if(index == 0){
            node deleted = head.next;
            head.next = deleted.next;
            this.size = this.size - 1;
            return true;
        }

        int count = 0;
        node deletedNodePrevious = head.next;

        while(deletedNodePrevious.next != null){
            if(count == index - 1){
                break;
            }
            deletedNodePrevious = deletedNodePrevious.next;
            count++;
        }

        node deletedNode = deletedNodePrevious.next;
        node deletedNodeNext = deletedNode.next;

        deletedNode.next = null;
        deletedNodePrevious.next = deletedNodeNext;

        this.size = this.size - 1;

        return true;

    }

    public int[] getValues() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        node temp = this.head.next;
        for(int i = 0; i < this.size; i++){
            arrayList.add(temp.item);
            temp = temp.next;
        }

        int[] res = new int[arrayList.size()];
        for(int i = 0; i < arrayList.size(); i++){
            res[i] = arrayList.get(i);
        }
        return res;
    }
}

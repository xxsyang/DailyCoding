public class HashTable {
    int capacity;
    int size;
    Node[] buckets;

    class Node{
        int key;
        int value;
        Node next;

        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.buckets = new Node[capacity];
    }

    public int hash(int key){
        return (key % capacity);
    }

    public void insert(int key, int value) {
        int hashIndex = hash(key);
        Node add = new Node(key, value);

        if(buckets[hashIndex] == null){
            buckets[hashIndex] = add;
            size++;
        }
        else{
            Node temp = buckets[hashIndex];
            if(temp.key == key){
                temp.value = value;
                return;
            }
            while(temp.next != null){
                if(temp.key == key){
                    temp.value = value;
                    return;
                }
                temp = temp.next;
            }
            temp.next = add;
            size++;
        }

        if(size >= capacity / 2){
            resize();
        }

    }

    public int get(int key) {
        int hashIndex = hash(key);

        if (buckets[hashIndex] != null) {
            Node temp = buckets[hashIndex];

            while (temp != null) {
                if (temp.key == key) {
                    return temp.value;
                }
                temp = temp.next;
            }
        }
        return -1;
    }

    public boolean remove(int key) {
        int hashIndex = hash(key);

        if (buckets[hashIndex] == null) {
            return false;
        }
        else {
            Node temp = buckets[hashIndex];
            Node pointer = buckets[hashIndex];
//            Node prev = null;
            int index = 0;
            int counter = 0;

            while (temp.next != null) {
                index++;
                if (temp.key == key) {
                    break;
                }
                temp = temp.next;
            }

            if (index == 0) {
                buckets[hashIndex] = temp.next;
                size--;
                return true;
            }
            else {
                while (pointer.next != null) {
                    if (counter == index - 1) {
                        break;
                    }
                    counter++;
                    pointer = pointer.next;
                }
                pointer.next = temp.next;
                size--;
                return true;
            }
        }
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void resize() {
        int oldCapacity = this.capacity;
        int newCapacity = oldCapacity * 2;
        Node[] newBuckets = new Node[newCapacity];

        for(int i = 0; i < oldCapacity; i++){
            if(buckets[i] != null){
                int hashIndex = hash(buckets[i].key);
                newBuckets[hashIndex] = buckets[i];
            }
        }

        this.capacity = newCapacity;
        this.buckets = newBuckets;
    }
}

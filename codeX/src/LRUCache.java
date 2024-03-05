import java.util.HashMap;
import java.util.Map;

class LRUCache {
    public class ListNode {
        int val;
        int key;
        ListNode next;
        ListNode prev;
        ListNode() {};
        ListNode(int key, int val) { this.key = key; this.val = val; }

    }
    int size;
    Map<Integer, ListNode> dic;
    int capacity;
    ListNode head;

    ListNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        dic = new HashMap<>();
        this.size = 0;
        this.head = new ListNode(-1, -1);
        this.tail = new ListNode(-1, -1);
        head.next = tail;
        head.prev = null;
        tail.prev = head;
        tail.next = null;
    }

    public int get(int key) {
        if(!dic.containsKey(key)){
            return -1;
        }

        ListNode temp = dic.get(key);
        remove(temp);
        addBack(temp);
        return temp.val;

    }

    public void put(int key, int value) {
        if(dic.containsKey(key)){
            ListNode temp = dic.get(key);
            temp.val = value;
            dic.put(key, temp);
            return;
        }

        if(size == 0){
            ListNode add = new ListNode(key, value);
            dic.put(key, add);
            addBack(add);
            size++;
            return;
        }

        ListNode add = new ListNode(key, value);
        dic.put(key, add);
        addBack(add);
        size++;

        if(size > capacity){
            ListNode temp = head.next;
            remove(temp);
            dic.remove(temp.key);
            size--;
        }



//        ListNode add = new ListNode(key, value);
    }

    public void addBack(ListNode node){
        ListNode temp = tail.prev;
        temp.next = node;
        node.prev = temp;
        node.next = tail;
        tail.prev = node;
    }

    public void remove(ListNode node){
        ListNode prev = node.prev;
        ListNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }
}

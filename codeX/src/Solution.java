import java.util.*;
import java.util.LinkedList;
//
//public class Solution {
//
//    public static int abs(int a, int b){
//        if(a - b <= 0){
//            return (a - b) * (-1);
//        }
//        else{
//            return a - b;
//        }
//    }
//
//    public static ArrayList<int[]> findNumPair(int[] arr, int difference){
//        int count = 0;
//        ArrayList setList = new ArrayList<int[]>();
//        for(int i = 0; i < arr.length; i++){
//            for(int j = i + 1; j < arr.length; j++){
//                int diff = abs(arr[i], arr[j]);
//                if(diff == difference){
//                    count = count + 1;
//                    int[] set = {arr[i], arr[j]};
//                    setList.add(set);
//                }
//            }
//        }
//        return setList;
//    }
//}

//import java.util.HashSet;
//import java.util.Set;
//
//class Solution {
//    public boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()){
//            return false;
//        }
//
//        Set<Character> set = new HashSet<>(s.length());
//
//        for(char b : s.toCharArray()){
//            if(!set.contains(b)){
//                set.add(b);
//            }
//        }
//
//        for(char m : t.toCharArray()){
//            if(set.add(m)){
//                return false;
//            }
//        }
//        return true;
//    }
//}


//import java.util.LinkedList;
//import java.util.Queue;
//
//class MyStack {
//    Queue<Integer> q1;
//    Queue<Integer> q2;
//    int top;
//    public MyStack() {
//        this.q1 = new LinkedList<>();
//        this.q2 = new LinkedList<>();
//        this.top = 0;
//    }
//
//    public void push(int x) {
//        q1.add(x);
//        top = x;
//    }
//
//    public int pop() {
//        while(q1.size() != 1){
//            int first = q1.remove();
//            q2.add(first);
//        }
//        int ret = q1.remove();
//        while(q2.size() != 0){
//            int pop = q2.remove();
//            q1.add(pop);
//        }
//
//        return ret;
//    }
//
//    public int top() {
//        return this.top;
//    }
//
//    public boolean empty() {
//        return q1.size() == 0;
//    }
//}
//class MinStack {
//    Stack<Integer> s1;
//    Stack<Integer> s2;
//    public MinStack() {
//        this.s1 = new Stack<>();
//        this.s2 = new Stack<>();
//
//    }
//
//    public void push(int val) {
//        if(s1.size() == 0){
//            s1.push(val);
//            s2.push(val);
//        }
//        if(val >= s2.peek()){
//            s1.push(val);
//        }
//        if(val < s2.peek()){
//            s1.push(val);
//            s2.push(val);
//        }
//
//    }
//
//    public void pop() {
//        if(!Objects.equals(s1.peek(), s2.peek())){
//            s1.pop();
//        }
//        else{
//            s1.pop();
//            s2.pop();
//        }
//
//
//    }
//
//    public int top() {
//        return s1.peek();
//    }
//
//    public int getMin() {
//        return s2.peek();
//    }
//}
//class ListNode{
//    int val;
//    ListNode next;
//    public ListNode(int val){
//        this.val = val;
//        this.next = null;
//    }
//}
//
//class MyLinkedList{
//    ListNode head;
//    int size;
//    public MyLinkedList() {
//        this.head = new ListNode(0);
//        this.size = 0;
//    }
//
//    public int get(int index) {
//        if(index < 0 || index >= size){
//            return -1;
//        }
//        ListNode temp = this.head;
//        int count = -1;
//        while(count != index){
//            temp = temp.next;
//            count++;
//        }
//        return temp.val;
//    }
//
//    public void addAtHead(int val) {
//        ListNode add = new ListNode(val);
//        ListNode temp = head.next;
//        head.next = add;
//        add.next = temp;
//        size++;
//    }
//
//    public void addAtTail(int val) {
//        if(size == 0){
//            addAtHead(val);
//            return;
//        }
//        ListNode temp = this.head;
//        int count = -1;
//        while(count != size - 1){
//            temp = temp.next;
//            count++;
//        }
//        ListNode add = new ListNode(val);
//        temp.next = null;
//        temp.next = add;
//        size++;
//    }
//
//    public void addAtIndex(int index, int val) {
//        if(index < 0 || index > size){
//            return;
//        }
//        if(index == size){
//            addAtTail(val);
//        }
//        if(index == 0){
//            addAtHead(val);
//        }
//
//        ListNode add = new ListNode(val);
//        ListNode temp = this.head;
//        int count = -1;
//        while(count != index - 1){
//            temp = temp.next;
//            count++;
//        }
//        ListNode tempNext = temp.next;
//        temp.next = add;
//        add.next = tempNext;
//        size++;
//    }
//
//    public void deleteAtIndex(int index) {
//        if(index < 0 || index >= size){
//            return;
//        }
//        ListNode prev = this.head;
//        ListNode rear = this.head;
//        ListNode target = this.head;
//        int count = -1;
//        int c2 = -1;
//        int c3 = -1;
//        while(count != index - 1){
//            prev = prev.next;
//            count++;
//        }
//        while(c3 != index){
//            target = target.next;
//            c3++;
//        }
//
//        while(c2 != index + 1){
//            rear = rear.next;
//            c2++;
//        }
//        prev.next = null;
//        target.next = null;
//        prev.next = rear;
//        size--;
//    }
//}

//class Solution {
//    public int[] sortArray(int[] nums) {
//        return mergeSort(nums, 0, nums.length - 1);
//    }
//
//    public int[] mergeSort(int[] arr, int startIndex, int endIndex){
//        if(endIndex - startIndex + 1 <= 1){
//            return arr;
//        }
//        int mid = (endIndex + startIndex) / 2;
//        mergeSort(arr, startIndex, mid);
//        mergeSort(arr, mid + 1, endIndex);
//
//        merge(arr, startIndex, mid, endIndex);
//
//        return arr;
//    }
//
//    public void merge(int[] arr, int startIndex, int mid, int endIndex){
//        int[] left = new int[mid+1 - startIndex];
//        int[] right = new int[endIndex - mid];
//
//        for(int i = 0; i < left.length; i++){
//            left[i] = arr[startIndex + i];
//        }
//        for(int j = 0; j < right.length; j++){
//            right[j] = arr[mid + 1 + j];
//        }
//
//        int leftIndex = 0;
//        int rightIndex = 0;
//        int arrIndex = startIndex;
//
//        while(leftIndex < left.length && rightIndex < right.length){
//            if(left[leftIndex] <= right[rightIndex]){
//                arr[arrIndex] = left[leftIndex];
//                leftIndex++;
//            }
//            else{
//                arr[arrIndex] = right[rightIndex];
//                rightIndex++;
//            }
//            arrIndex++;
//        }
//
//        while( leftIndex < left.length){
//            arr[arrIndex] = left[leftIndex];
//            leftIndex++;
//            arrIndex++;
//        }
//
//        while( rightIndex < right.length){
//            arr[arrIndex] = right[rightIndex];
//            rightIndex++;
//            arrIndex++;
//        }
//    }
//}
//class Solution {
//    public int strStr(String haystack, String needle) {
//        char[] hay = haystack.toCharArray();
//        char[] needleArr = needle.toCharArray();
//        char[] windows = new char[needle.length()];
//
//        if(needleArr.length > hay.length){
//            return -1;
//        }
//        if(needleArr.length == 1){
//            for(int i = 0; i < hay.length; i++){
//                if(hay[i] == needleArr[0]){
//                    return i;
//                }
//            }
//        }
//        if(hay.length == needleArr.length){
//            if(Arrays.toString(hay).equals(Arrays.toString(needleArr))){
//                return 0;
//            }
//            else{
//                return -1;
//            }
//        }
//        int minSize = hay.length - needleArr.length ;
//
//        for(int i = 0; i < hay.length; i++){
//            if(i == minSize){
//                if(hay.length - i == needleArr.length){
//                    for(int j = 0; j < needleArr.length; j++){
//                        windows[j] = hay[i + j];
//                    }
//                    if(Arrays.equals(windows, needleArr)){
//                        return i;
//                    }
//                }
//                break;
//            }
//
//            if(hay[i] == needleArr[0]){
//                for(int j = 0; j < needleArr.length; j++){
//                    windows[j] = hay[i + j];
//                }
//                if(Arrays.equals(windows, needleArr)){
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
//}
//class Solution {
//    public boolean isValidSudoku(char[][] board) {
//        Set<Integer> set = new HashSet<Integer>();
//        for(int i = 1; i < 10; i++){
//            set.add(i);
//        }
//        return true;
//    }
//}


//import java.lang.Math;
//
//class Solution {
//    public int minEatingSpeed(int[] piles, int h) {
//        int leftIndex = 0;
//        int rightIndex = piles.length - 1;
//        int max = Math.max(piles[leftIndex], piles[rightIndex]);
//
//
//
//    }
//}

//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> res = new ArrayList<List<Integer>>();
//
//        for(int j = 0; j < nums.length - 2; j++){
//            if(j > 0 && nums[j] == nums[j-1]){
//                continue;
//            }
//            int low = j + 1;
//            int high = nums.length - 1;
//
//            while(low < high){
//                int sum = nums[j] + nums[low] + nums[high];
//                if(sum == 0){
//                    List<Integer> arr = new ArrayList<Integer>();
//                    arr.add(nums[j]);
//                    arr.add(nums[low]);
//                    arr.add(nums[high]);
//                    res.add(arr);
//                    while (low < high && nums[low] == nums[low + 1]) {
//                        low++;
//                    }
//                    // Skip duplicate elements for k
//                    while (low < high && nums[high] == nums[high - 1]) {
//                        high--;
//                    }
//                    low++;
//                    high--;
//                }
//                else if(sum < 0){
//                    low++;
//                }
//                else{
//                    high--;
//                }
//            }
//        }
//        return res;
//    }
//}

//class Solution {
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int[] afterExtra = new int[candies.length];
//
//        for(int i = 0; i < candies.length; i++){
//            int temp = candies[i] + extraCandies;
//            afterExtra[i] = temp;
//        }
//
//        List<Boolean> res = new ArrayList<Boolean>();
//        for(int j = 0; j <afterExtra.length; j++){
//            if(afterExtra[j] >= Arrays.stream(afterExtra).max().getAsInt()){
//                res.add(true);
//            }
//            else{
//                res.add(false);
//            }
//        }
//
//        return res;
//    }
//}

//class Solution {
//    public int[] searchRange(int[] nums, int target) {
//        if(nums.length == 0){
//            return new int[] {-1, -1};
//        }
//        if(nums[0] == target){
//            if(nums[nums.length - 1] == target){
//                return new int[] {0, nums.length - 1};
//            }
//            for(int i = 1; i < nums.length; i++){
//                if(nums[i] != target){
//                    return new int[]{0, i};
//                }
//            }
//        }
//
//        int firstOccur = binarySearch(nums, target);
//        int lastOccur = 0;
//
//        if(firstOccur == -1){
//            return new int[] {-1, -1};
//        }
//        else{
//            for(int i = firstOccur + 1; i < nums.length; i++){
//                if(nums[i] != target){
//                    lastOccur = i - 1;
//                    break;
//                }
//            }
//        }
//        return new int[] {firstOccur, lastOccur};
//    }
//
//    public int binarySearch(int[] nums, int target) {
//        int low = 0;
//        int high = nums.length - 1;
//
//        while(low <= high){
//            int mid = low + (high - low)/2;
//            if(nums[mid] == target && nums[mid - 1] < target){
//                return mid;
//            }
//            else if(nums[mid] < target){
//                low = mid + 1;
//            }
//            else{
//                high = mid - 1;
//            }
//        }
//
//        return -1;
//    }
//}

//public class Solution {
//    ListNode getMid(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
////        ListNode temp = head;
//        while (fast.next != null && fast.next.next != null) {
//            fast = head.next.next;
//            slow = head.next;
//            head = head.next;
//        }
////        slow.next = null;
//        return slow;
//    }
//
//}


//class Solution {
//    public int[] topKFrequent(int[] nums, int k) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int num : nums){
//            if(!map.containsKey(num)){
//                map.put(num, 1);
//            }
//            else{
//                Integer count = map.get(num);
//                count++;
//                map.put(num, count);
//            }
//
//        }
//
//        List<Map.Entry<Integer, Integer>> sortedEntries = sortByValueAscending(map);
//
//        int[] res = new int[k];
//
//        for(int i = 0; i < k; i++){
//            res[i] = sortedEntries.get(i).getKey();
//        }
//        return res;
//
//    }
//
//    public static List<Map.Entry<Integer, Integer>> sortByValueAscending(Map<Integer, Integer> map) {
//        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
//
//        // Sort the entry list by values in ascending order
//        entryList.sort(Map.Entry.comparingByValue());
//        Collections.reverse(entryList);
//        return entryList;
//    }
//}

//class Solution {
//    public int kthSmallest(TreeNode root, int k) {
//        ArrayList<Integer> res = new ArrayList<>();
//        ArrayList<Integer> valuelist = inOrder(root, res);
//
//        int[] intArray = res.stream().mapToInt(Integer::intValue).toArray();
//
//        for(int i = 0; i < intArray.length; i++){
//            if(i == k){
//                return intArray[i];
//            }
//        }
//        return 0;
//    }
//
//    public ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> res){
//        if(root == null){
//            return res;
//        }
//
//        inOrder(root.left, res);
//        res.add(root.val);
//        inOrder(root.right, res);
//
//        return res;
//    }
//}


//class Solution {
//
//    class Node{
//        int x;
//        int y;
//        boolean hasVisited;
//        public Node(int x, int y){
//            this.x = x;
//            this.y = y;
//            this.hasVisited = false;
//        }
//    }
//    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
//        boolean isSame = true;
//        int referenceValue = image[sr][sc];
//
//        for (int i = 0; i < image.length; i++) {
//            for (int j = 0; j < image[i].length; j++) {
//                if (image[i][j] != referenceValue) {
//                    isSame = false;
//                    break;
//                }
//            }
//        }
//
//        if(isSame){
//            for(int i = 0; i < image.length; i++){
//                for(int j = 0; j < image[i].length; j++){
//                    image[i][j] = color;
//                }
//            }
//            return image;
//        }
//
//        int row = image.length;
//        int col = image[0].length;
//
//
//        Queue<Node> queue = new LinkedList<>();
//        Node start = new Node(sr, sc);
//        queue.add(start);
//        int originalColor = image[sr][sc];
//
//        while(!queue.isEmpty()){
//            Node temp = queue.poll();
//            int x = temp.x;
//            int y = temp.y;
//            boolean visited = temp.hasVisited;;
//            if(x - 1 >= 0 && image[x - 1][y] == originalColor && !visited){
//                queue.add(new Node(x - 1, y));
//                image[x-1][y] = color;
//                temp.hasVisited = true;
//            }
//            if(x + 1 < row && image[x + 1][y] == originalColor && !visited){
//                queue.add(new Node(x + 1, y));
//                image[x+1][y] = color;
//                temp.hasVisited = true;
//            }
//            if(y - 1 >= 0 && image[x][y - 1] == originalColor && !visited){
//                queue.add(new Node(x, y - 1));
//                image[x][y-1] = color;
//                temp.hasVisited = true;
//            }
//            if(y + 1 < col && image[x][y + 1] == originalColor && !visited){
//                queue.add(new Node(x, y + 1));
//                image[x][y+1] = color;
//                temp.hasVisited = true;
//            }
//        }
//
//
//
//
//        return image;
//
//
//    }
//}



//class Solution {
//
//    public void swap(int[][] matrix, int col1, int col2) {
//        for (int k = 0; k < matrix.length; k++) {
//            int temp = matrix[k][col1];
//            matrix[k][col1] = matrix[k][col2];
//            matrix[k][col2] = temp;
//        }
//    }
//
//    public void rotate(int[][] matrix) {
//        int n = matrix.length;
//
//        int[][] transposed = new int[n][n];
//
//        //transpose
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                transposed[j][i] = matrix[i][j];
//            }
//        }
//
//        //swap each column
//        for (int i = 0; i < n / 2; i++) {
//            swap(transposed, i, n - 1 - i);
//        }
//
//        //copy back to original matrix
//        for (int i = 0; i < n; i++) {
//            matrix[i] = transposed[i];
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                transposed[i][j] = matrix[i][j];
//            }
//        }
//
//    }
//}



//class Solution {
//    public boolean isValidSudoku(char[][] board) {
//        Boolean setOK = true;
//        Boolean colOK = true;
//        Boolean blockOK = true;
//
//        for (int i = 0; i < board.length; i++) {
//            HashSet<Character> row = new HashSet<>();
//            for (int j = 0; j < board.length; j++) {
//                if(board[i][j] == '.'){
//                    continue;
//                }
//                if(!row.add(board[i][j])){
//                    setOK = false;
//                }
//            }
//        }
//
//        for (int i = 0; i < board.length; i++) {
//            HashSet<Character> col = new HashSet<>();
//            for (int j = 0; j < board.length; j++) {
//                if(board[j][i] == '.'){
//                    continue;
//                }
//                if(!col.add(board[j][i])){
//                    colOK = false;
//                }
//            }
//        }
//
//        for (int i = 2; i < 11; i = i + 3) {
//
//            HashSet<Character> block1 = new HashSet<>();
//            HashSet<Character> block2 = new HashSet<>();
//            HashSet<Character> block3 = new HashSet<>();
//
//            for (int j = 0; j < 3; j++) {
//
//                if(board[i][j] == '.' || board[i - 1][j] == '.' || board[i - 2][j] == '.'){
//                    continue;
//                }
//
//                if(!block1.add(board[i][j])){
//                    blockOK = false;
//                }
//                if(block2.add(board[i - 1][j])){
//                    blockOK = false;
//                }
//                if(block3.add(board[i - 2][j])){
//                    blockOK = false;
//                }
//
//            }
//
//            for (int j = 3; j < 6; j++) {
//
//                if(board[i][j] == '.' || board[i - 1][j] == '.' || board[i - 2][j] == '.'){
//                    continue;
//                }
//
//                if(!block1.add(board[i][j])){
//                    blockOK = false;
//                }
//                if(block2.add(board[i - 1][j])){
//                    blockOK = false;
//                }
//                if(block3.add(board[i - 2][j])){
//                    blockOK = false;
//                }
//
//            }
//
//            for (int j = 6; j < 9; j++) {
//
//                if(board[i][j] == '.' || board[i - 1][j] == '.' || board[i - 2][j] == '.'){
//                    continue;
//                }
//
//                if(!block1.add(board[i][j])){
//                    blockOK = false;
//                }
//                if(block2.add(board[i - 1][j])){
//                    blockOK = false;
//                }
//                if(block3.add(board[i - 2][j])){
//                    blockOK = false;
//                }
//
//            }
//        }
//
//        return !setOK && !colOK && !blockOK;
//    }
//}


//import java.util.Stack;

//class Solution {
//    public int evalRPN(String[] tokens) {
//        Stack<String> container = new Stack<>();
//
//        for(String str : tokens){
//            if(str.contains("+") || str.contains("-") || str.contains("*") || str.contains("/")){
//                int rhs = Integer.parseInt(container.pop());
//                int lhs = Integer.parseInt(container.pop());
//                int temp = 0;
//                if(str.equals("+")){
//                    temp = lhs + rhs;
//                }
//                if(str.equals("-")){
//                    temp = lhs - rhs;
//                }
//                if(str.equals("*")){
//                    temp = lhs * rhs;
//                }
//                if(str.equals("/")){
//                    temp = lhs / rhs;
//                }
//                container.push(String.valueOf(temp));
//            }
//            else{
//                container.push(str);
//            }
//        }
//
//        return Integer.parseInt(container.pop());
//        for(int i = 0; i < tokensArr.length; i++){
//            if(!"+-*/".contains(tokens[i])){
//                container.push(Integer.valueOf(tokensArr[i]));
//                continue;
//            }
//
//            int rhs = container.pop();
//            int lhs = container.pop();
//
//            int temp = 0;
//
//            if(tokensArr[i] == '+')
//                temp = lhs + rhs;
//            if(tokensArr[i] == '-')
//                temp = lhs - rhs;
//            if(tokensArr[i] == '*')
//                temp = lhs * rhs;
//            if(tokensArr[i] == '/')
//                temp = lhs / rhs;
//
//
//            container.push(temp);
//
//        }
//
//        return container.pop();


    // if (tokens[i] == '+' ||
    //     tokens[i] == '-' ||
    //     tokens[i] == '*' ||
    //     tokens[i] == '/') {
    //         return
    // }
    // container.add(tokens[i]);
//    }
//}


//class Solution {
//    public boolean canReachLeaf(TreeNode root){
//        if (root == null || root.val == 0) {
//            return false;
//        }
//
//        if(root.left == null && root.right == null){
//            return true;
//        }
//
//        if(canReachLeaf((root.left)) && canReachLeaf(root.right)){
//            return true;
//        }
//
//        if(canReachLeaf(root.left)){
//            return true;
//        }
//
//        if(canReachLeaf(root.right)){
//            return true;
//        }
//
//        if(canReachLeaf(root.left)){
//            return true;
//        }
//
//        return canReachLeaf(root.left) || canReachLeaf(root.right);
//    }
//}

//class Solution {
//
//
//    public int maxAncestorDiff(TreeNode root) {
//        if(root == null){
//            return 0;
//        }
//
//        return helper(root, root.val, root.val);
//    }
//
//
//    public int helper(TreeNode node, int currMax, int currMin) {
//        if(node == null){
//            return currMax - currMin;
//        }
//
//        currMax = Math.max(node.val, currMax);
//        currMin = Math.min(node.val, currMin);
//
//
//        int left = helper(node.left, currMax, currMin);
//        int right = helper(node.right, currMax, currMin);
//
//
//        return Math.max(left, right);
//    }
//}

//class Solution {
//    public int amountOfTime(TreeNode root, int start) {
//
//    }
//
//    public void convert(TreeNode curr, int parent, Map <Integer, ArrayList<Integer>> map) {
//        if (curr == null) {
//            return;
//        }
//
//        if (!map.containsKey(curr.val)) {
//            map.put(curr.val, new ArrayList<Integer>());
//        }
//
//        map.get(curr.val).add(parent);
//
//
//    }
//
//}



//class Solution {
//    public String addBinary(String a, String b) {
//        int p1 = a.length() - 1;
//        int p2 = b.length() - 1;
//        int carry = 0;
//        ArrayList<Integer> res = new ArrayList<>();
//
//        while (p1 >= 0 || p2 >= 0 || carry > 0) {
//            int sum = carry;
//            if(p1 >= 0){
//                int aValue = Character.getNumericValue(a.charAt(p1));
//                sum += aValue;
//                p1--;
//            }
//            if(p2 >= 0){
//                int bValue = Character.getNumericValue(b.charAt(p2));
//                sum += bValue;
//                p2--;
//            }
//            carry = sum / 2;
//            sum = sum % 2;
//            res.add(sum);
//
//        }
//
//        StringBuilder ans = new StringBuilder();
//        for(int i = res.size() - 1; i >= 0; i--){
//            ans.append(res.get(i));
//        }
//        return ans.toString();
//    }
//    public int[] modifyArr(int[] arr, int index){
//        for(int i = index; i < arr.length - 1; i++){
//
//            arr[i] = arr[i + 1];
//        }
//        return arr;
//    }
//
//    public int removeDuplicates(int[] nums) {
//        if (nums.length == 1) {
//            return 1;
//        }
//
//        int slow = 0;
//        int fast = 1;
//        int res = nums.length;
//        int count = 1;
//
//        while (fast < res) {
//            if (nums[fast] == nums[slow]) {
//                count++;
//            }
//            if( nums[fast] != nums[slow] ){
//                count = 1;
//                slow = fast;
//            }
//            if (count > 2) {
//                nums = modifyArr(nums, fast);
//                slow = fast - 1;
//                res--;
//                continue;
//            }
//            fast++;
//        }
//
//        return res;
//    }
////////////////////////////////////////////////////////////
//        for(int i = 0; i < nums.length; i++){
//            if(nums[fast] == nums[slow]){
//                fast++;
//            }
//            if(nums[fast] == nums[fast + 1]) {
//                nums = modifyArr(nums, fast);
//            }
//        }

//    public List<Integer> spiralOrder(int[][] matrix) {
//        List<Integer> res = new ArrayList<>();
//
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//
//        int top = 0;
//        int right = cols - 1;
//        int left = 0;
//        int down = rows - 1;
//
//
//        while(res.size() < rows * cols) {
//            //add top row
//            for(int col = top; col <= right; col++){
//                res.add(matrix[top][col]);
//            }
//            //add right col(not include the first row)
//            for(int row = top + 1; row <= down; row++){
//                res.add(matrix[row][right]);
//            }
//            //add bottom col(not include the first row)
//            for(int col = right - 1; col >= 0; col--){
//                res.add(matrix[down][col]);
//            }
//            //add left col(not include the top and bottom row)
//            for(int row = down - 1; row > 0; row--){
//                res.add(matrix[row][left]);
//            }
//            top++;
//            right--;
//            left++;
//            down--;
//        }
//
//        return res;
//    }
//}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];

        boolean isSame = true;

        for(int i = 0; i < temperatures.length; i++){
            if(temperatures[i] != temperatures[0]){
                isSame = false;
                break;
            }
        }

        if(isSame){
            return res;
        }

        Stack<Integer> rhs = new Stack<>();
        Stack<Integer> lhs = new Stack<>();
        int slowIndex = 0, fastIndex = 0;

        for(int i = 0; i < temperatures.length - 1; i++){
            slowIndex = i;
            fastIndex = i + 1;

            rhs.push(temperatures[slowIndex]);
            lhs.push(temperatures[fastIndex]);

            int rhsValue = rhs.peek();
            int lhsValue = lhs.peek();
            int count = 1;

            if(rhsValue < lhsValue){
                res[slowIndex] = 1;
                rhs.pop();
                lhs.pop();
            }
            else {
                fastIndex++;
                count++;

                while(fastIndex < temperatures.length - 1){
                    lhs.pop();
                    lhs.push(temperatures[fastIndex]);

                    lhsValue = lhs.peek();

                    if(rhsValue < lhsValue){
                        res[slowIndex] = count;
                        rhs.pop();
                        lhs.pop();
                        break;
                    }
                    else{
                        count++;
                    }

                    fastIndex++;

                }

                if(fastIndex >= temperatures.length - 1) {
                    if(fastIndex == temperatures.length - 1){
                        lhs.push(temperatures[fastIndex]);
                        lhsValue = lhs.peek();
                        if (rhsValue < lhsValue) {
                            res[slowIndex] = count;
                        }
                        else {
                            res[slowIndex] = 0;
                        }
                    }
                    else {
                        res[slowIndex] = 0;
                    }
                    rhs.pop();
                    lhs.pop();
                }
            }
        }
        return res;
    }
}


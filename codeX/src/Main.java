import java.util.*;
import java.util.Collections;


public class Main {

//    public static boolean hasPathSum(TreeNode root) {
//
////        ArrayList<int[]> mem = new ArrayList<>();
//        if(root == null || root.val == 11) return true;
//
//        if(root.left == null && root.right == null) return false;
//
//        if (hasPathSum(root.left)) return true;
//
//        if (hasPathSum(root.right)) return true;
//
//        return false;
//    }

//    public static void bfs(TreeNode root) {
//        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
//        if (root != null) {
//            queue.add(root);
//        }
//        int level = 0;
//        while(!queue.isEmpty()) {
//            System.out.print("level " + level + ": ");
//            int levelLength = queue.size();
//            for (int i = 0; i < levelLength; i++) {
//                TreeNode curr = queue.removeFirst();
//                System.out.print(curr.val + " ");
//                if(curr.left != null) {
//                    queue.add(curr.left);
//                }
//                if(curr.right != null) {
//                    queue.add(curr.right);
//                }
//            }
//            level++;
//            System.out.println();
//        }
//    }
//    public static int binarySearch(int target, List<Integer> ranked) {
//        int low = 0;
//        int high = ranked.size() - 1;
//
//        while (low <= high) {
//            int mid = (high - low) / 2 + low;
//
//            if (ranked.get(mid) < target) {
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return low;
//    }
//
//    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
//        // Write your code here
//        List<Integer> res = new ArrayList<>();
//
//        for(Integer score : player){
//            int index = binarySearch(score, ranked);
//            List<Integer> rankIndex = new ArrayList<>();
//            List<Integer> removed = new ArrayList<>();
//            ranked.add(index, score);
//            ranked.equals(ranked);
//
//            int rankNum = 0;
//
//            Map<Integer, List<Integer>> reversedRankMap = new HashMap<>();
//
//
//            for(int i = 0; i < ranked.size(); i++){
//                int curr = ranked.get(i);
//                if(!reversedRankMap.containsKey(curr)){
//                    reversedRankMap.put(curr, new ArrayList<>());
//                }
//                reversedRankMap.get(curr).add(i+1);
//            }
//
//            res.add(reversedRankMap.get(score));

//            for (Integer integer : ranked) {
//                if (removed.size() == 0){
//                    rankNum++;
//                    removed.add(integer);
//                    rankIndex.add(rankNum);
//                    if(score.equals(integer)){
//                          res.add(rankNum);
//                    }
//                    continue;
//                }
//
//                boolean isDuplicate = removed.contains(integer);
//
//                if (!isDuplicate) {
//                    rankNum++;
//                    removed.add(integer);
//                    rankIndex.add(rankNum);
//                    if(score.equals(integer)){
//                        res.add(rankNum);
//                    }
//
//                }
//                else {
//                    rankIndex.add(rankNum);
//                    if(score.equals(integer) && !removed.contains(score)){
//                        res.add(rankNum);
//                    }
//                }
//
//
//            }
//        }
//
//        return res;
//    }


//    public static int migratoryBirds(List<Integer> arr) {
//        // Write your code here
//        HashMap<Integer, Integer> map = new HashMap<>();
//        // HashSet<Integer> set = new HashSet<>();
//
//        for(Integer num : arr){
//            if(!map.containsKey(num)){
//                map.put(num, 0);
//            }
//        }
//
//        Set<Integer> keySet = map.keySet();
//
//        for(Integer key : keySet){
//            int count = 0;
//            for(Integer num : arr){
//                if(Objects.equals(key, num)){
//                    count++;
//                    map.put(key, count);
//                }
//            }
//        }
//
//        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();


    // for(int i = 0; i < arr.size(); i++){
    //     int curr = arr.get(i);
    //     int count = 0;
    //     if(map.containsKey(curr) == true){
    //         map.put(curr, count++);
    //     }

    // }
//    }
//    public static int countingValleys(int steps, String path) {
//        // Write your code here
//        char[] pathArr = path.toCharArray();
//        int seaLevel = 0;
//        int res = 0;
//
//
//        for(char eachChar : pathArr){
//            boolean wasBelowSeaLevel = seaLevel < 0;
//
//            if(eachChar == 'U'){
//                seaLevel = seaLevel + 1;
//
//            }
//            if(eachChar == 'D'){
//                seaLevel = seaLevel - 1;
//            }
//
//            if(seaLevel == 0 && wasBelowSeaLevel){
//                res++;
//            }
//        }
//
//        return res;
//
//    }


//    public static int diagonalDifference(List<List<Integer>> arr) {
//        // Write your code here
//        int dimension = arr.size();
//        int leftRightSum = 0;
//        int rightLeftSum = 0;
//        int res = 0;
//
//        for(int i = 0; i < dimension; i++){
//            List<Integer> curr = arr.get(i);
//            leftRightSum = leftRightSum + curr.get(i);
//        }
//
//        for(int j = 0; j < dimension; j++){
//            List<Integer> curr = arr.get(j);
//            rightLeftSum = rightLeftSum + curr.get(dimension - 1 - j);
//        }
//
//        res = Math.abs(leftRightSum - rightLeftSum);
//
//        return res;
//    }
//    public static long flippingBits(long n) {
//        // Write your code here
////        long res = 0;
////
////        res = n ^ 0xffffffff;
//
//        return (long)(Math.pow(2,32)-1-n);
//    }

//    public static List<Integer> gradingStudents(List<Integer> grades) {
//        // Write your code here
//        for(Integer grade : grades){
//            if(grade < 38){
//                continue;
//            }
//            else{
//                int nextMultiple = grade + (5 - grade % 5);
//                if(nextMultiple - grade < 3){
//                    grades.set(grades.indexOf(grade), nextMultiple);
//                }
//            }
//        }
//
//        return grades;
//    }


//    public static int lonelyinteger(List<Integer> a) {
//        // Write your code here
//        HashSet<Integer> set = new HashSet<>();
//        int[] arr = new int[a.size()];
//
//        for (int i = 0; i < a.size(); i++) {
//            arr[i] = a.get(i);
//        }
//
//        for (int j : arr) {
//            if (!set.add(j)) {
//                set.remove(j);
//                break;
//            }
//        }
//
//        return (int) set.toArray()[0];
//    }


//    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
//        // Write your code here
//        ArrayList<Integer> res = new ArrayList<>();
//
//        for(String eachQuery : queries){
//            int count = 0;
//            for(String eachString : strings){
//                if(eachQuery.equals(eachString)){
//                    count++;
//                }
//            }
//            res.add(count);
//        }
//
//        return res;
//    }

//    public static int longestConsecutive(int[] nums) {
//        if (nums.length == 0) return 0;
//        if (nums.length == 1) {
//            return 1;
//        }
//
//        if (nums.length == 2 && nums[0] == nums[1]) {
//            return 1;
//        }
//
//        Arrays.sort(nums);
//
//        ArrayList<Integer> lengths = new ArrayList<>();
//        int max = 0;
//        int curr = 1;
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == nums[i + 1]) {
//                continue;
//            }
//            if (nums[i] == nums[i + 1] - 1) {
//                curr++;
//                max = curr;
//                lengths.add(max);
//            } else {
//                curr = 1;
//            }
//        }
//
//        if (lengths.size() == 0) {
//            return 1;
//        }
//
//        return Collections.max(lengths);
//    }

//
//    public static void main(String[] args) {
//        int[] test = {-6,-1,-1,9,-8,-6,-6,4,4,-3,-8,-1};
//        System.out.println(longestConsecutive(test));

//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(3);
//        root.right = new TreeNode(6);
//        root.left.left = new TreeNode(2);
//        root.right.left = new TreeNode(5);
//        root.right.right = new TreeNode(7);
//
//        System.out.println(hasPathSum(root));
////        HashTable myHashTable = new HashTable(8);
//        myHashTable.insert(8, 0);
////        myHashTable.get(4);
//        myHashTable.insert(16, 0);
//        myHashTable.insert(24, 0);
//
//        System.out.println(myHashTable.get(24));
//        myHashTable.remove(8);
//        myHashTable.remove(8);
//        System.out.println(myHashTable.remove(24));
//        System.out.println(myHashTable.get(24));
//
//        System.out.println(myHashTable.remove(16));
//        System.out.println(myHashTable.get(16));
//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(3);
//        root.right = new TreeNode(6);
//        root.left.left = new TreeNode(2);
//        root.right.left = new TreeNode(5);
//        root.right.right = new TreeNode(7);

//        bfs(root);


//        List<Integer> test = new ArrayList<>();
//        test.add(100);
//        test.add(100);
//        test.add(50);
////        test.add(50);
//        test.add(40);
//        test.add(40);
//        test.add(20);
//        test.add(10);
////        test.add(50);
//        List<Integer> player = new ArrayList<>();
//        player.add(5);
//        player.add(25);
//        player.add(50);
//        player.add(120);

//        test.add(100);
//        test.add(90);
//        test.add(90);
//        test.add(80);
//        test.add(75);
//        test.add(60);
//
//        player.add(50);
//        player.add(65);
//        player.add(77);
//        player.add(90);
//        player.add(102);

//        List<Integer> rank = new ArrayList<>();
//        List<Integer> removed = new ArrayList<>();

//        int rankNum = 0;
//        System.out.println(binarySearch(120, test));
//        List<Integer> res = climbingLeaderboard(test, player);
//
//        System.out.println(res);


//        for (Integer integer : test) {
//            boolean isDuplicate = removed.contains(integer);
//            if (!isDuplicate) {
//                rankNum++;
//                if(removed.size() == 0){
//                    removed.add(integer);
//                    rank.add(rankNum);
//                    continue;
//                }
//                removed.add(integer);
//                rank.add(rankNum);
//            } else {
//                rank.add(rankNum);
//            }
//        }
//
//        System.out.println(rank);
//
//    }
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
////        Scanner sc = new Scanner(System.in);
////        String userInput = sc.nextLine();
//        String[] patternList = {"S;M;", "C;V;", "C;C;", "S;C;", "C;M;", "S;V;"};
//        String pattern = "S;M;";
////        String regex = "[A-Za-z]+;[A-Za-z]+;";
//
//        Scanner sc = new Scanner(System.in);
//
//        ArrayList<String> userInputList = new ArrayList<>();
//        String userInput = sc.nextLine();
//        userInputList.add(userInput);
//
////        while(sc.hasNextLine()) {
////            String userInput = sc.nextLine();
////            userInputList.add(userInput);
////        }
//
//
//
//        for(String eachInput : userInputList) {
//            for (String eachPattern : patternList) {
//                if (eachInput.contains(eachPattern)) {
//                    pattern = eachPattern;
//                    if (pattern.equals("S;M;")) {
//                        String[] raw = eachInput.split("S;M;");
//                        String filteredString = raw[1].replaceAll("[^A-Za-z]", "");
//                        StringBuilder result = new StringBuilder();
//
//                        for (int i = 0; i < filteredString.length(); i++) {
//                            char currentChar = filteredString.charAt(i);
//                            if (Character.isUpperCase(currentChar)) {
//                                currentChar = Character.toLowerCase(currentChar);
//                                result.append(" "); // Insert a space before the uppercase character
//                            }
//                            result.append(currentChar);
//                        }
//                        String spacedString = result.toString();
//                        System.out.println(spacedString);
//
//                    }
//                    if (pattern.equals("C;V;")) {
//                        String[] raw = eachInput.split("C;V;");
//                        StringBuilder result = new StringBuilder();
//
//                        for (int i = 0; i < raw[1].length(); i++) {
//                            char currentChar = raw[1].charAt(i);
//                            if (currentChar == ' ') {
//                                currentChar = raw[1].charAt(i + 1);
//                                currentChar = Character.toUpperCase(currentChar);
//                                i++;
//                            }
//                            result.append(currentChar);
//                        }
//                        String spacedString = result.toString();
//                        System.out.println(spacedString);
//                    }
//                    if (pattern.equals("C;C;")) {
//                        String[] raw = eachInput.split("C;C;");
//                        StringBuilder result = new StringBuilder();
//
//                        for (int i = 0; i < raw[1].length(); i++) {
//                            char currentChar = raw[1].charAt(i);
//                            if (i == 0) {
//                                currentChar = Character.toUpperCase(currentChar);
//                            }
//                            if (currentChar == ' ') {
//                                currentChar = raw[1].charAt(i + 1);
//                                currentChar = Character.toUpperCase(currentChar);
//                                i++;
//                            }
//                            result.append(currentChar);
//                        }
//                        String spacedString = result.toString();
//                        System.out.println(spacedString);
//                    }
//                    if (pattern.equals("S;C;")) {
//                        String[] raw = eachInput.split("S;C;");
//                        StringBuilder result = new StringBuilder();
//
//                        for (int i = 0; i < raw[1].length(); i++) {
//                            char currentChar = raw[1].charAt(i);
//                            if (i == 0) {
//                                currentChar = Character.toLowerCase(currentChar);
//                            }
//                            if (Character.isUpperCase(currentChar)) {
//                                result.append(" ");
//                                currentChar = Character.toLowerCase(currentChar);
//                            }
//                            result.append(currentChar);
//                        }
//                        String spacedString = result.toString();
//                        System.out.println(spacedString);
//                    }
//
//                    if (pattern.equals("C;M;")) {
//                        String[] raw = eachInput.split("C;M;");
//                        StringBuilder result = new StringBuilder();
//
//                        for (int i = 0; i < raw[1].length(); i++) {
//                            char currentChar = raw[1].charAt(i);
//                            if (currentChar == ' ') {
//                                currentChar = raw[1].charAt(i + 1);
//                                currentChar = Character.toUpperCase(currentChar);
//                                i++;
//                            }
//                            result.append(currentChar);
//                        }
//                        result.append("()");
//                        String spacedString = result.toString();
//                        System.out.println(spacedString);
//                    }
//                    if (pattern.equals("S;V;")) {
//                        String[] raw = eachInput.split("S;V;");
//                        StringBuilder result = new StringBuilder();
//
//                        for (int i = 0; i < raw[1].length(); i++) {
//                            char currentChar = raw[1].charAt(i);
//                            if (Character.isUpperCase(currentChar)) {
//                                result.append(" ");
//                                currentChar = Character.toLowerCase(currentChar);
//                            }
//                            result.append(currentChar);
//                        }
//                        String spacedString = result.toString();
//                        System.out.println(spacedString);
//                    }
//                }
//            }
//        }
//    }
//}


//    public void rotate(int[][] matrix) {
//        int n = matrix.length;
//
//        //transpose
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = matrix[j][i];
//            }
//        }
//
//
//        ArrayList<int[]> temp = new ArrayList<>();
//
//        //swith pos for each pair
//
//
//        for (int j = 0; j < n; j++) {
//            int[] arr = new int[n];
//            for (int k = 0; k < arr.length; k++) {
//                arr[k] = matrix[k][j];
//            }
//            temp.add(arr);
//        }
//    }



//    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
//        int row = image.length;
//        int col = image[0].length;
//
//        Queue<int[][]> queue = (Queue<int[][]>) new LinkedList();
//        // boolean[][] visvited = new boolean[][];
//
//        queue.add({sr, sc});
//        int originalColor = image[sr][sc];
//
//        while (!queue.empty()) {
//            int currX = queue.peek();
//            int currY =
//        }
        // for(int i = 0; i < image.length; i++){
        //     if(i == sr){
        //         for(int j = 0; j < image[i].length; j++){
        //             if( j == sc){
        //                 image[i][j] = color;
        //             }
        //         }
        //     }
        // }
        // return image;



    public static void main(String[] args) {
//        Solution sol = new Solution();
//        int[] test = {77,77,77,77,77,41,77,41,41,77};
//        int[] res = sol.dailyTemperatures(test);
//
//        System.out.println(Arrays.toString(res));

        MinHeap heap = new MinHeap();
        heap.push(14);
        heap.push(19);
        heap.push(16);
        heap.push(17);

        System.out.println(heap.getSize());
//        LRUCache cache = new LRUCache(2);
//        cache.put(2, 1);
//        cache.put(1, 1);
//        cache.put(2, 3);
//        cache.put(4, 1);
//
//        System.out.println(cache.get(1));
//        cache.get(1);
//        cache.get(1);
//        cache.put(3, 3);

//        String a = "11";
//        String b = "1";
//
//        Solution sol = new Solution();
//        System.out.println(sol.addBinary(a, b));

//        int[] test = {1, 1, 1, 2, 2, 3};
//        int[] test1 = {0,0,1,1,1,1,2,3,3};
//        Solution sol = new Solution();
//        System.out.println(sol.removeDuplicates(test1));
//        System.out.println(Arrays.toString(test1));
//        int[][] test1 = {{1,2,3}, {4,5,6}, {7,8,9}};
//        int[][] test = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12} ,{13,14,15,16}};
//
//        Solution sol = new Solution();
//        System.out.println(sol.spiralOrder(test));



//        TreeNode root = new TreeNode(8);
//
//        root.left = new TreeNode(3);
//        root.left.right = new TreeNode(6);
//        root.left.right.right = new TreeNode(7);
//        root.left.right.left = new TreeNode(4);
//        root.left.left = new TreeNode(1);
//
//        root.right = new TreeNode(10);
//        root.right.right = new TreeNode(10);
//        root.right.right = new TreeNode(14);
//        root.right.right.left = new TreeNode(13);
//
//
//        Solution sol = new Solution();
//
//        System.out.println(sol.maxAncestorDiff(root));


//        char[][] test = {{'5','3','.','.','7','.',.",".","."},
//                        {'6','.',".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
//        int[][] test = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

////        Solution sol = new Solution();
////
////        int[][] res = sol.floodFill(test, 1, 1, 2);
//        char[][] test = {};
//        Solution sol = new Solution();
//        sol.isValidSudoku(test);
//        System.out.println(
//                Arrays.deepToString(test)
//        );
//        TreeMap map = new TreeMap();
//        map.insert(1, 2);
//        map.insert(4, 2);
//        map.insert(3,7);
//        map.insert(2, 1);
//        List<Integer> test1 = map.getInorderKeys();
//        map.remove(1);
//        map.getInorderKeys();
//        LinkedList list = new LinkedList();
//        list.insertHead(1);
//        list.insertHead(2);
//        list.insertTail(3);
//        list.insertTail(4);
//        list.insertHead(5);
//        System.out.println(list.get(0));
//        System.out.println(list.get(2));
//        System.out.println(list.get(4));
//        list.remove(2);
//        list.remove(0);
//        list.insertHead(6);
//        list.insertTail(7);

//        list.get(5);
//        System.out.println(list.size);
//        System.out.println(list.get(2));

//        int[] test = list.getValues();

//        System.out.println(Arrays.toString(test));

//        DynamicArray arr = new DynamicArray(3);
//        arr.pushback(1);
//        arr.pushback(2);
//        arr.pushback(3);
//
//        int size =arr.getSize();
//        int capacity = arr.getCapacity();
//        arr.pushback(2);
//        arr.pushback(3);
//        arr.pushback(4);

//        int res = arr.popback();
//        int res2 = arr.popback();
//        Solution sol = new Solution();
//        ListNode test1 = new ListNode(1);
//        test1.next = new ListNode(2);
//        test1.next.next = new ListNode(3);
//        test1.next.next.next = new ListNode(4);
//        test1.next.next.next.next = new ListNode(5);
//        ListNode testResult = sol.getMid(test1);
//        System.out.println(sol.getMid(test1).val);
//        String S = "leet";
//        String T = "leetcode";
////        T.indexOf(S);
//        System.out.println(T.indexOf(S));
//        System.out.println(T.indexOf(S));
//        Solution sol = new Solution();
//        int[] test1 = {-1, 0, 1, 2, -1, -4};
//        sol.threeSum(test1);
//        sol.strStr("mississippi", "issip");
//        Set<Integer> set = new HashSet<Integer>();
//        for(int i = 1; i < 10; i++){
//            set.add(i);
//        }
//        System.out.println(set);
//        MyLinkedList list = new MyLinkedList();
//        list.addAtHead(7);
//        list.addAtHead(2);
//        list.addAtHead(1);
//        list.addAtIndex(3, 0);
//        list.deleteAtIndex(2);
//        list.addAtTail(89);
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));

//        int[] arrTest1 = {1, 7, 5, 9, 2, 12, 3};
//
//        for(int i = 0; i < arrTest1.length; i++){
//            System.out.print(arrTest1[i] + " ");
//        }
//
//        System.out.println();
//
//        System.out.println(arrTest1.length);
//
//        ArrayList<int[]> output = Solution.findNumPair(arrTest1, 2);
//
//        for(int i = 0; i < output.size(); i++){
//            System.out.println(Arrays.toString(output.get(i)));
//        }
    }
}
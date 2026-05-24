class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> min_heap = new PriorityQueue<>(
            k+1,
            Map.Entry.comparingByValue()
        );

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            min_heap.add(entry);
            if (min_heap.size() > k) {
                min_heap.poll();
            }
        }

        return min_heap.stream().mapToInt(Map.Entry::getKey).toArray();
        
    }
}

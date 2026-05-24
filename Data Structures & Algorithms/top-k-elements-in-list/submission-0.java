class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        return entries.subList(0, k).stream().mapToInt(Map.Entry::getKey).toArray();
        
    }
}

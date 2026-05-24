class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] arr = new List[nums.length+1];

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (arr[entry.getValue()] == null) {
                arr[entry.getValue()] = new ArrayList<>();
            }
            arr[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int idx = 0;
        for (int i = nums.length; i >= 0 && idx < k; i--) {
            if (arr[i] != null) {
                for (int num : arr[i]) {
                    result[idx++] = num;
                    if (idx == k) break;
                }
            }
        }

        return result;
        
    }
}

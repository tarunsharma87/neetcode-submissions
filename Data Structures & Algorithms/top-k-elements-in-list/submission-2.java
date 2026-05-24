class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> arr = new ArrayList<>();
        for (int i=0; i<=nums.length; i++) {
            arr.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            arr.get(entry.getValue()).add(entry.getKey());
        }

        int[] result = new int[k];
        int idx = 0;
        for (int i = nums.length; i >= 0 && idx < k; i--) {
            for (int num : arr.get(i)) {
                result[idx++] = num;
                if (idx == k) break;
            }
        }

        return result;
        
    }
}

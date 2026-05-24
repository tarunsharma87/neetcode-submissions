class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int a = 0;
        int b = 0;
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                a = map.get(target-nums[i]);
                b = i;
                break;
            }
            map.put(nums[i], i);
        }

        return a < b ? new int[]{a,b} : new int[]{b,a}; 
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }

        int max = 0;
        
        for (int num: nums) {
            if (!set.contains(num-1)) {
                int i = 1;
                while (set.contains(num+i)) {
                    i++;
                }

                max = i > max ? i : max;
            }
        }
        return max;
    }
}

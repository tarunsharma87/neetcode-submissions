class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();

        for (int i=0; i<nums.length-2;i++) {
            if (i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int current = nums[i];
            int start = i+1;
            int end = nums.length-1;

            while(start < end) {
                if (current+nums[start]+nums[end] < 0) {
                    start++;
                } 
                else if (current+nums[start]+nums[end] > 0) {
                    end--;
                }
                else { // a match found
                    output.add(List.of(current, nums[start], nums[end]));
                    start++;
                    end--;

                    // skip until same number
                    while (start<nums.length && nums[start] == nums[start-1]){
                        start++;
                    };
                    while (end>i && nums[end] == nums[end+1]) {
                        end--;
                    };
                }
            }
        }
        return output;
    }
}

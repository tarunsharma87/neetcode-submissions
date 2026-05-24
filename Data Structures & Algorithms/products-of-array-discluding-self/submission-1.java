class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];
        output[0] = 1;
        for (int i=1; i<nums.length; i++) {
            output[i] = nums[i-1]*output[i-1];
        }

        int right_product_so_far = nums[nums.length-1];
        for (int i=nums.length-2; i>=0; i--) {
            output[i] = output[i]*right_product_so_far;
            right_product_so_far = right_product_so_far * nums[i];
        }

        return output;
        
    }
}  

class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        
        for(int i=1; i<nums.length; i++) {
            right += nums[i];
        }
        
        int pivot = 0;
        while(left != right && ++pivot < nums.length) {
            left += nums[pivot-1];
            right -= nums[pivot];
        }
        
        if(pivot >= nums.length) {
            pivot = -1;
        }
        return pivot;
    }
}
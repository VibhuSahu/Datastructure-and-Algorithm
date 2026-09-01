class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int iseven = -1;

            for (int j = i + 1; j < n; j++) {
                if (nums[j] % 2 == 0) {
                    iseven = j;
                    break;
                }
            }

            if (iseven != -1) {
                // swap
                int temp = nums[i];
                nums[i] = nums[iseven];
                nums[iseven] = temp;
            }
        }

        return nums;
        
    }
}
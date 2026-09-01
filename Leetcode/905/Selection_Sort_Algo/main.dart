class Solution {
  List<int> sortArrayByParity(List<int> nums) {
    int n = nums.length;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (nums[j] % 2 == 0) {
                // swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                break;
            }
        }
    } 
    return nums;
  }
}
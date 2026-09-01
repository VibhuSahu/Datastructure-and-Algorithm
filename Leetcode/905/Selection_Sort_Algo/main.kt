class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        val n = nums.count()
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                if (nums[j] % 2 == 0) {
                    // swap
                    val temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                    break
                }
            }
        }
        return nums
    }
}
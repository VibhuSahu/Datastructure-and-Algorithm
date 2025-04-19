class Solution {
    fun findNumbers(nums: IntArray): Int {
        var count = 0
        for (num in nums) {
            val numm = (log10(abs(num).toDouble()) + 1).toInt()
            if (numm % 2 == 0) {
                count++
            }
        }
        return count
    }
}
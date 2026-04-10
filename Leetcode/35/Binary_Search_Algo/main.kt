class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var start: Int = 0
        var end: Int = nums.size - 1

        while(start <= end) {
            var mid: Int = (end + start) / 2
            // var mid: Int = start + (end - start) / 2

            if (target < nums[mid]) {
                end = mid - 1
            } else if (target > nums[mid]) {
                start = mid + 1
            } else {
                return mid
            }
        }
        return start
    }
}
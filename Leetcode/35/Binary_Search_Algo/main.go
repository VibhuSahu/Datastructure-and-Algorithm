func searchInsert(nums []int, target int) int {
    var start int = 0
    var end int = len(nums) - 1

    for (start <= end) {
        var mid int = start + (end - start) / 2
        // var mid int = (end + start) / 2

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
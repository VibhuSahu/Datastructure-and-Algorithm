class Solution {
    func sortArrayByParity(_ nums: [Int]) -> [Int] {
        var nums = nums
        var n: Int = nums.count
        for i in 0..<n { 
            for j in (i+1)..<n {
                if nums[j] % 2 == 0 {
                    // swap
                    var temp: Int = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                    break
                }
            }
        }
        return nums
    }
}
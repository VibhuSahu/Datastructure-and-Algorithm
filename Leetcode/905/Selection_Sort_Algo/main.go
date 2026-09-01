func sortArrayByParity(nums []int) []int {
    n := len(nums)

    for i:= 0; i < n; i++ {
        for j:= i+1; j < n; j++ {
            if nums[j] % 2 == 0 {
                // swap
                temp := nums[i]
                nums[i] = nums[j]
                nums[j] = temp
                break
            }
        }
    }

    return nums
    
}
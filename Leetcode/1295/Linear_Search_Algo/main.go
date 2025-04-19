func findNumbers(nums []int) int {
    var count int = 0

    for _,num := range nums {
        numm := int(math.Log10(math.Abs(float64(num))) + 1)
        if numm%2==0 {
            count++
        }
    }
    return count   
}
class Solution {
    func findNumbers(_ nums: [Int]) -> Int {
        var count: Int = 0
        for num in nums {
            let numm = Int(log10(Double(abs(num))) + 1)
            if (numm%2==0) {
                count+=1
            }
        }       
        return count
    }
}
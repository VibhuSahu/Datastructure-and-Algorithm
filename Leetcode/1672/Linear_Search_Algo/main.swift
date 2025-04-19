class Solution {
    func maximumWealth(_ accounts: [[Int]]) -> Int {
        var max: Int = 0
        for customer in accounts {
            var transactions: Int = 0
            for transaction in customer {
                transactions += transaction
            }
            if (max < transactions) {
                max = transactions
            }
        }
    return max        
    }
}
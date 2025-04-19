func maximumWealth(accounts [][]int) int {
    var max int = 0
    for _,customer := range accounts {
        var transactions int = 0
        for _,transaction := range customer {
            transactions += transaction
        }
        if (max < transactions) {
            max = transactions
        }
    }
    return max   
}
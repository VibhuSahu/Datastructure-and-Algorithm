function maximumWealth(accounts: number[][]): number {
    let max: number = 0;

    for (const customer of accounts) {
        let transactions: number = 0;
        for (const transaction of customer) {
            transactions += transaction;
        }
        if (max<transactions) {
            max = transactions;
        }
    }
    return max;  
};
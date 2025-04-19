int maximumWealth(int** accounts, int accountsSize, int* accountsColSize) {
    int max = 0;
    for (int customer = 0; customer < accountsSize; customer++) {
        int transactions = 0;
        for (int transaction = 0; transaction < accountsColSize[customer]; transaction++) {
            transactions += accounts[customer][transaction];
        }
        if (max < transactions) {
            max = transactions;
        }
    }
    return max;
}
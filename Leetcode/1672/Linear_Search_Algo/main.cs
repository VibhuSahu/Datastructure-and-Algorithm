public class Solution {
    public int MaximumWealth(int[][] accounts) {
        int max = 0;
        foreach (int[] customer in accounts) {
            int transactions = 0;
            foreach (int transaction in customer) {
                transactions += transaction;
            }
            if (max < transactions) {
                max = transactions;
            }
        }
        return max;
    }
}
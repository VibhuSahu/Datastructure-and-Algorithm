class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int[] customer: accounts) {
            int transections = 0;
            for (int transection: customer) {
                transections = transections + transection;
            }
            if (max < transections) {
                max = transections;
            }

        }
        return max;
        
    }
}
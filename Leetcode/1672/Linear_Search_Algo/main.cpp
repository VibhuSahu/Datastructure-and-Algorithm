class Solution {
    public:
        int maximumWealth(vector<vector<int>>& accounts) {
            int max = 0;
            for (vector<int> customer: accounts) {
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
    };
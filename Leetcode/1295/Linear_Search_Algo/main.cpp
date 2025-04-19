class Solution {
    public:
        int findNumbers(vector<int>& nums) {
            int count = 0;
            for (int num: nums) {
                num = (int) (log10(num) + 1);
                if (num%2==0) count++;
            }
    
            return count;
            
        }
    };
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            num = (int) (Math.log10(num) + 1);          // using (int) Math.log10(x) + 1 number of digit number have
            if (num%2==0) count++;
        }
        
        return count;
    }
}
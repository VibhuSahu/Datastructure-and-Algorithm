public class Solution {
    public int FindNumbers(int[] nums) {
        int count = 0;
        foreach (int num in nums) {
            int numm = (int) Math.Log10(num) + 1;
            if (numm%2==0) count++;
        }
        
        return count;
    }
}
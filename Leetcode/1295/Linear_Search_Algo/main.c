int findNumbers(int* nums, int numsSize) {
    int num, count = 0;

    for (int i=0; i<numsSize; i++) {
        num = (int) (log10(nums[i]) + 1);

        if (num%2==0) count++;
    }
    
    return count;
}
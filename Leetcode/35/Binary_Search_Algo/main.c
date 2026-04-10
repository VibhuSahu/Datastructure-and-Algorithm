int searchInsert(int* nums, int numsSize, int target) {
    int start = 0;
    --numsSize;
    
    while (start <= numsSize) {
        int mid = start + (numsSize - start) / 2;
        // int mid = (numsSize + start) / 2;

        if (target < nums[mid]) {
            numsSize = mid - 1;
        } else if (target > nums[mid]) {
            start = mid + 1;
        } else {
            return mid;
        }
    }

    return start;

    
}
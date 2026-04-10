function searchInsert(nums: number[], target: number): number {
    let start: number = 0;
    let end: number = nums.length - 1;

    while(start <= end) {
        // let mid: number = Math.floor(start + (end - start) / 2);
        let mid: number = Math.floor((end + start) / 2);

        if (target < nums[mid]) {
            end = mid - 1; 
        } else if (target > nums[mid]) {
            start = mid + 1;
        } else {
            return mid;
        }
    }

    return start;
};
function sortArrayByParity(nums: number[]): number[] {
    let n: number = nums.length;

    for (let i: number = 0; i < n; i++) {
        for (let j: number = i + 1; j < n; j++) {
            if (nums[j] % 2 == 0) {
                // swap
                let temp: number = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                break;
            }
        }
    }
    return nums;
};
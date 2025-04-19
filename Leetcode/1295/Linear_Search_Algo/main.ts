function findNumbers(nums: number[]): number {
    let count: number = 0;
    for (const num of nums) {
        let numm: number = Math.trunc(Math.log10(num) + 1)
        if (numm%2==0) { count++; }
    }
    return count;
};
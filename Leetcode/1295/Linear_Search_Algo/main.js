/**
 * @param {number[]} nums
 * @return {number}
 */
var findNumbers = function(nums) {
    let count = 0;
    for (let num of nums) {
        // Handle the case where num is less than 1
        let digitCount = num < 1 ? 1 : Math.trunc(Math.log10(num) + 1);
        if (digitCount % 2 === 0) {
            count++;
        }
    }
    return count;
};
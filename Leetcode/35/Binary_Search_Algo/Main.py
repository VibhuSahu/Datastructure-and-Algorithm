# Python 3 code
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        start: int = 0
        end: int = len(nums) - 1

        while (start <= end):
            # mid: int = start + (end - start) // 2
            mid: int = (start + end) // 2

            if (target < nums[mid]):
                end = mid - 1
            elif (target > nums[mid]):
                start = mid + 1
            else:
                return mid

        return start

# Old Python code
class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        start = 0
        end = len(nums) - 1 

        while(start <= end):
            # mid = start + (end - start) // 2
            mid = (start + end) // 2

            if (target < nums[mid]):
                end = mid - 1
            elif (target > nums[mid]):
                start = mid + 1
            else:
                return mid
        
        return start
        
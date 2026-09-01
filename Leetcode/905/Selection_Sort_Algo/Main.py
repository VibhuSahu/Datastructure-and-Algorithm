# Python 3 code
class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        n = len(nums)

        for i in range(n):
            iseven = -1
            for j in range(i+1,n):
                if (nums[j] % 2 == 0):
                    iseven = j
                    break
            
            if (iseven != -1):
                temp = nums[i]
                nums[i] = nums[iseven]
                nums[iseven] = temp
        return nums


# Old Python code
class Solution(object):
    def sortArrayByParity(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        for i in range(n):
            iseven = -1
            for j in range(i+1, n):
                if (nums[j] % 2 == 0):
                    iseven = j
                    break
            
            if (iseven != -1):
                temp = nums[i]
                nums[i] = nums[iseven]
                nums[iseven] = temp
        
        return nums
        
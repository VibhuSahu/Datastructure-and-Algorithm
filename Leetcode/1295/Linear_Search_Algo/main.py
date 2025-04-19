# using python old
class Solution(object):
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        for num in nums:
            
            num = int(math.log10(num) + 1)
            if (num%2==0):
                count = count + 1
        return count

        
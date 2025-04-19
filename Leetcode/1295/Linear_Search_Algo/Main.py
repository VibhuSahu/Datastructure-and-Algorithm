# using Python3 latest

class Solution:
    def findNumbers(self, nums: List[int]) -> int:

        count: int = 0

        for num in nums:
            num = int(math.log10(num)+1)
            if (num%2==0):
                count+=1
        return count
        
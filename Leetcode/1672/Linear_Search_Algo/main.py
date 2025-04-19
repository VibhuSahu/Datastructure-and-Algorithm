# using Python old
class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        max = 0

        for customer in accounts:
            transactions = 0
            for transaction in customer:
                transactions = transactions + transaction
            if (max < transactions):
                max = transactions
        
        return max
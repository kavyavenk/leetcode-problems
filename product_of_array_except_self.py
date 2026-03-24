# O(n) solution, can't use division operator
# think of prefix prod and postfix prod

from typing import List
class product_of_array_except_self:
    def prodArrayExcSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)

        prefix = 1
        i = 0
        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i]

        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= postfix
            postfix *= nums[i]
        return res
# O(n log n) time | O(n) space
from typing import List
class smaller_numbers_than_current:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        mapping = {}
        smaller = []
        sort = sorted(nums)
        for i in range(len(sort)):
            if sort[i] not in mapping:
                mapping[sort[i]] = i
        for i in range(len(nums)):
            smaller.append(mapping[nums[i]])
        return smaller

        #    nums = [8,1,2,2,3]
        #  sorted = [1,2,2,3,8]
        # smaller = [0,1,2,3,4] <- return this

        # for i, num in enumerate(sort):
        #     if num not in mapping:
        #         mapping[num] = i
        # for num in nums:
        #     smaller.append(mapping[num])
        # return smaller

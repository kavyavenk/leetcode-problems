from typing import List
class missing_number:
    def missingNumber(self, nums: List[int]) -> int:
        # nums.sort()
        # # sorting is O(n log n)
        # for i, v in enumerate(nums):
        #     if i!=v:
        #         return v-1
        #     if v==len(nums)-1:
        #         return v+1
        
        # return sum(range(len(nums)+1)) - sum(nums)
        
        n = len(nums)
        total_sum = n*(n+1)//2
        actual_sum = sum(nums)
        return total_sum - actual_sum
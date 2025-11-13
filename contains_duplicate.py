from typing import List

# O(n) time | O(n) space
class contains_duplicate:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # seen = set()
        # for num in nums:
        #     if num in seen:
        #         return True
        #     seen.add(num)
        # return False
        return len(nums) != len(set(nums))
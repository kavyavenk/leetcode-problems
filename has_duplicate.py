# has duplicate
# check if length of list = length of list converted to a set 
# because no duplicate elements in a set

from typing import List

class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        return len(nums) != len(set(nums))
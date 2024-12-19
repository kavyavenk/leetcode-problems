class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs.sort()
        front = strs[0]
        back = strs[-1]
        minlen = min(len(front), len(back))
        i = 0
        while i < minlen and front[i] == back[i]:
            i = i + 1
        return front[:i]
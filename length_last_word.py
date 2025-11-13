class length_last_word:
    def lengthOfLastWord(self, s: str) -> int:
        return len(s.split()[-1])

        # alternate approach
        # l = []
        # count = 0
        # for char in s:
        #     if char != ' ':
        #         count += 1
        #     else:
        #         if count != 0:
        #             l.append(count)
        #             count = 0
        # # handle last word count
        # if count != 0:
        #     l.append(count)
        # return l[-1] if l else 0
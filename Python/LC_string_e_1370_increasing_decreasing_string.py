'''
One way to solve, but regarding time complexity, s * s * sorting = O(logN**3)

Let's consider a better time complexity solution with collections.Counter.
'''
from collections import Counter

class Solution:
    def sortString(self, s: str) -> str:
        s = list(s)
        result = ''
        while s:
            for letter in sorted(set(s)):
                s.remove(letter)
                result += letter
            for letter in sorted(set(s), reverse=True):
                s.remove(letter)
                result += letter
            return result

    def sortString_with_Counter(self, s: str) -> str:
        s_dict = Counter(s)
        result = ''

        while s_dict:
            for char in sorted(s_dict):
                temp = s_dict[char]
                result += char

                if temp == 1:
                    s_dict.pop(char)
                else:
                    s_dict[char] = temp - 1

            for char in sorted(s_dict, reverse = True):
                temp = s_dict[char]
                result += char

                if temp == 1:
                    s_dict.pop(char)
                else:
                    s_dict[char] = temp - 1

        return result
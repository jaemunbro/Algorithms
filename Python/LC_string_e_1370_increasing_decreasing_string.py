'''
One way to solve, but regarding time complexity, s * s * sorting = O(logN**3)

Let's consider a better time complexity solution with collections.Counter.
'''
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

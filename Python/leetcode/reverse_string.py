"""
Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.
"""
from typing import List


class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        #ABC
        #ABCD
        left = 0
        right = len(s) - 0
        while left < right:
            temp = s[left]
            s[left] = s[right]
            s[right] = temp

            left = left + 1
            right = right - 1

"""
time complexity = O(N)
space complexity = O(1)
"""





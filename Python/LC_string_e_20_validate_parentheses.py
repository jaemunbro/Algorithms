# leetcode 20

class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        mapping = {')':'(', '}':'{', ']':'['}

        for char in s:
            if char in ['[', '(', '{']:
                stack.append(char)

            if char in mapping:
                if not stack:
                    return False
                elif mapping[char] != stack.pop():
                    return False

        if len(stack) != 0:
            return False
        return True



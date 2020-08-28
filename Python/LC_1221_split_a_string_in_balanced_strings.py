'''my solution'''
class Solution:
    def balancedStringSplit(self, s: str) -> int:
        r_cnt = 0
        l_cnt = 0
        result = 0

        for i in range(len(s)):
            if s[i] == 'R':
                r_cnt += 1
            else:
                l_cnt += 1

            if (i+1) % 2 == 0 and r_cnt == l_cnt:
                result += 1
                r_cnt = 0
                l_cnt = 0

        return result


''' 
another solution to think of.. 
count + when L and - when R
add 0 when cnt == 0
'''

# class Solution:
#     def balancedStringSplit(self, s: str) -> int:
#         res = cnt = 0
#         for c in s:
#             cnt += c == 'L'
#             cnt -= c == 'R'
#             res += cnt == 0
#         return res
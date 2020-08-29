import re

# 1 line
def freqAlphabets(s):
    return ''.join(chr(int(i[:2]) + 96) for i in re.findall(r'\d{2}#|\d', s))

# class Solution:
#     def freqAlphabets(self, s: str) -> str:
#         alphabet = 'abcdefghijklmnopqrstuvwxyz'
#         decoder = dict()
#         output = ''

#         for char in alphabet:
#             if (ord(char) - ord('a') + 1) >= 10:
#                 decoder[str(ord(char) - ord('a') + 1) + '#'] = char
#             else:
#                 decoder[str(ord(char) - ord('a') + 1)] = char

#         while len(s) > 0:
#         # for i in range(len(s)):
#             if len(s) >= 3 and s[2] == '#':
#                 output = output + str(decoder.get(s[0:3]))
#                 s = s[3:]
#             else:
#                 output = output + str(decoder.get(s[0]))
#                 s = s[1:]

#         return output

# make s to list with regex
# loop
# map the number to the alphabet with ascii num.
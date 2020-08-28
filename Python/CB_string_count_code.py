'''
https://codingbat.com/prob/p186048
'''


def count_code(str):
    result = 0

    for i in range(len(str)-3):
        if str[i:i+2] == 'co' and str[i+3] == 'e':
            result+=1

    return result


'''
with regex
'''
# import re
#
# def count_code(str):
#     result = 0
#     pattern = 'co\s+e'
#
#     for i in range(len(str)-3):
#         match = re.search(pattern, str[i:i+4])
#         if match:
#             result += 1
#             print(result)
#     return result
#

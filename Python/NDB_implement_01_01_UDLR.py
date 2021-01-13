'''
time complexity : N
space complexity : 1
'''

n = int(input())
route = list(input().split())

direction= {"L":[0, -1],
            "R":[0, 1],
            "U":[-1, 0],
            "D":[1, 0]}

raw_col_pointer = [1, 1]

for next in route:
    if 0 == (raw_col_pointer[0] + direction[next][0]) \
            or 0 == (raw_col_pointer[1] + direction[next][1]) \
            or n < (raw_col_pointer[0] + direction[next][0]) \
            or n < (raw_col_pointer[1] + direction[next][1]):
        continue
    raw_col_pointer[0] = raw_col_pointer[0] + direction[next][0]
    raw_col_pointer[1] = raw_col_pointer[1] + direction[next][1]



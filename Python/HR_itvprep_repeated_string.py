# Enter your code here. Read input from STDIN. Print output to STDOUT

# variable : result_cnt
# full length / length inputstring
# string[:remainder]
result_cnt = 0
remainder_cnt = 0

s = input()
n = int(input())
iter_cnt = n // len(s)
remainder = n % len(s)

for idx, char in enumerate(s):
    if idx < remainder:
        if char == 'a':
            remainder_cnt += 1
    if char == 'a':
        result_cnt += 1

print((result_cnt * iter_cnt) + remainder_cnt)

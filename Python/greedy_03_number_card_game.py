'''
n : rows
m : columns
'''
n,m  = map(int, input().split())
print(n)
print(m)

result = 0
for i in range(n):
    row = list(map(int, input().split()))
    min_val = min(row)
    print(min_val)

    if min_val > result:
        result = min_val

print(result)
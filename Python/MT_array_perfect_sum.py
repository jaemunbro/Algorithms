# n = input1
# array = input2
# target_sum = input3
n = 5
array = [5, 7, 3, 12, 7]
target_sum = 14

# greedy? X

from itertools import combinations

a = []

for i in array:
    if isinstance(i, int) is not True:
        print(999)

array.sort()
# print(list(combinations(enumerate(tm), 2)))
for i in range(1, n+1):
    for j in list(combinations(array, i)):
        a.append(j)

print(a)

result = 0
for i in a:
    if sum(i) > target_sum:
        break
    if sum(i) == target_sum:
        result += 1

if result == 0:
    print(999)
else:
    print(result)


# took 45 min
# failed on time complexity
# time complexity : O(N^2)
# 부분집합을 빼면 될 듯.  how?
num_books = 3
total_time = 7
pts = [2, 6, 9]
tm  = [3, 5, 3]
# scheduling
# 위치 상관 있는 모든 경우의 수 : 순열 permutation
# 위치는 상관 없는 모든 경우의 수를 구해야 : 조합 combination

max_point = 0

from itertools import combinations

a = []
b = []
# print(list(combinations(enumerate(tm), 2)))
for i in range(1, num_books+1):
    for j in list(combinations(enumerate(tm), i)):
        a.append(j)

print(a)

for i in a:
    time_sum = 0
    for j in range(len(i)):
        time_sum += i[j][1]
        if time_sum > total_time:
            time_sum = 0
            break

    if time_sum > 0:
        point_sum = 0
        for j in range(len(i)):
            point_sum += pts[i[j][0]]
        if point_sum > max_point:
            max_point = point_sum

print(max_point)
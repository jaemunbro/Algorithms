# n,m,k = map(int, input().split())
# data = list(map(int, input().split()))

n,m,k = 5, 8, 3
data = [2, 4, 5, 4, 6]

data.sort()
print(data)

first = data[n-1]
second = data[n-2]
print(second)

loop_count = int(m / (k + 1))
rest_count = m%(k+1)

first_added_sum = loop_count * first * k
second_added_sum = loop_count * second
rest_added_sum = rest_count * first

result = first_added_sum + second_added_sum + rest_added_sum
print(result)
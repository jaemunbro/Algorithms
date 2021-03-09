# gold mine

# test case 1<= T <= 1000
T = 1
# n = y, m = x
# 1<= n,m <= 20
n, m = 3, 4
# number of gold

# 1 <= number of gold <= 100
array = [1, 3, 3, 2, 2, 1, 4, 1, 0, 6, 4, 7]

# array to gold_mine
gold_mine = [
    [1, 3, 3, 2],
    [2, 1, 4, 1],
    [0, 6, 4, 7]
]

dp_part = [0] * (m)
dp = list()
dp_nested = list()
for i in range(len(array)):
    dp_nested.append(array[i])
    if (i + 1) % m == 0:
        dp.append(dp_nested)
        dp_nested = []

print(dp)
#recurrence product
# i행 j열
# dp[i][j] = array[i][j] + max(dp[i-1][j], dp[i-1][j-1], dp[i-1][j+1])

# dp
# [[1, 3, 3, 2],
#  [2, 1, 4, 1],
#  [0, 6, 4, 7]]
j=1

#dp[0][0], dp[1][0] -> dp[0][1]
#dp[0][0], dp[1][0], dp[2][0] -> dp[1][1]
#dp[2][1]

#dp[0][2]
#dp[1][2]
#dp[2][2]
#....
max_gold = 0
for j in range(1, m):
    for i in range(n):
        # from the ceil
        if i == 0:
            dp[i][j] = dp[i][j] + max(dp[i][j-1], dp[i+1][j-1])
        # from the bottom
        elif i == (n - 1):
            dp[i][j] = dp[i][j] + max(dp[i-1][j-1], dp[i][j-1])
        else:
            # mid
            dp[i][j] = dp[i][j] + max(dp[i-1][j-1], dp[i][j-1], dp[i+1][j-1])

        if dp[i][j] > max_gold:
            max_gold = dp[i][j]

print(max_gold)


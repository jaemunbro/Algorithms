# ant warrior
# N
N = 4 # 3 <= N <= 100
K = [1, 5, 1, 4] # 0 <= k <= 1000
# return maximum

# 점화식 recurrence relation
# a(i) = max(a(i-1), a(i-2) + k(i))
dp = [0] * N

dp[0] = K[0]
dp[1] = max(K[0], K[1])

for i in range(2, len(K)):
    dp[i] = max(dp[i-1], dp[i-2] + K[i])

print(dp[N-1])
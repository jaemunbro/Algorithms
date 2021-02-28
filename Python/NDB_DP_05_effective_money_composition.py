# 2021-02-24, p226
N = 2 # 1 <= N <= 100
M = 15 # 1 <= M <= 10000
money = [2, 3] # 1 < money value < 10000

# 금액 i를 만들기 위한
# 화페 개수 a, 단위 k
# i = target amount = 1~10000
dp = [10001] * (M + 1)
# 점화식 Recurrence relation
# a(i) 화폐개수
# a(i) = min(a(i), a(i-k) + 1)
dp[0] = 0
for money in moneys:
    for i in range(money, M + 1):
        # for문 money
        if dp[i - money] != -1:
            dp[i] = min(dp[i-money] + 1, dp[i])

for i in range(len(dp)):
    if dp[i] == 10001:
        dp[i] = -1

print(dp[M])

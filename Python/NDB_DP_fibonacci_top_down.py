# Memoization list
memo = [0] * 100

memo[1], memo[2] = 1, 1

def fibo(n):
    if n == 1 or n == 2:
        return 1

    if memo[n] == 0:
        memo[n] = fibo(n - 1) + fibo(n - 2)

    return(memo[n])


print(fibo(99))

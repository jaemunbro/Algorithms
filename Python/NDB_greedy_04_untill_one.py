'''
n : total number
k : divider
'''
n, k = map(int, input().split())

i = 0
while n != 1:
    if n % k == 0:
        n = n / k
        i += 1
        print("n : " + str(n))

    else:
        n = n - 1
        i += 1
        print("n : " + str(n))

print(i)

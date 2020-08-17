'''
since the cases available are below 100,000,
the problem can be handled with brute force.
It would OK to use brute force to handle problems below 1m cases.

time complexity : n^3
space complexity : 1

'''
n = int(input())

result = 0
for i in range(0,n+1):
    for j in range(0, 59):
        for k in range(0, 59):
            if '3' in (str(i) + str(j) + str(k)):
                print(str(i) + str(j) + str(k))
                result += 1
                print(result)

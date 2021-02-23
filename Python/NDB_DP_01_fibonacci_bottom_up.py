np = [0] * 100

np[1] = 1
np[2] = 1
n = 99

for i in range(3, n+1):
    np[i] = np[i-1] + np[i-2]

print(np[n])
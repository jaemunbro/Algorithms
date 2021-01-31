n = int(input())
s = []
for i in range(n):
    s.append(list(input().split()))

s.sort(key=lambda x:x[1], reverse=True)
for i in range(len(s)):
    print(s[i][1], end = ' ')
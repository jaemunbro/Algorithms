# Enter your code here. Read input from STDIN. Print output to STDOUT
a = set(input().split())
t = int(input())

result = True

for i in range(t):
    b = set(input().split())
    if len(b) != len(a.intersection(b)):
        result = False
        break

print(result)


# p.182

# n, k = input().split()
# a = list(map(int, input().split()))
# b = list(map(int, input().split()))
n, k =  5, 3
a = [1,2,5,4,3]
b = [5,5,6,6,5]

b.sort(reverse=True)
a.sort(reverse=False)

for i in range(k):
    if b[i] > a[i]:
        a[i], b[i] = b[i], a[i]
    else:
        break

print(sum(a))
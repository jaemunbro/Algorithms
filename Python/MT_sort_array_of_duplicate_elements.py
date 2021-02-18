# took 15 min


a = [4,4,8,7,7,7,5]
print(a[:-1])
b = set()

a.sort()
for index, num in enumerate(a[:-1]):
    if a[index] == a[index+1]:
        b.add(num)
if not b:
    b.add(-1)

print(b)




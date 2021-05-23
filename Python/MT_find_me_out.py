#n = input()

n = 9
i = 2

while True:
    x = n * i
    sum = 0
    for j in range(len(str(x))):
        sum += int(str(x)[j])
    if n == sum:
        break
    elif x >= 10E10:
        print(-1)

    i += 1


print(x)


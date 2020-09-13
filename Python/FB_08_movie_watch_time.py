# 0, 10

# # if start value or end value between the other time frame,
# # take min value, max value
# 15, 25
# 12, 20
# -> 12, 25

# 30, 48

# 48 - 30
# 25 - 12
# 10 - 0

t = [(0, 10), (15, 25), (12, 20), (30, 48)]

#sorted
t = sorted(t, key = lambda x : x[0])
result = []
#for i in range(len(t)-1):
i = 0
while t:
    if len(t) > 1:
        if t[i + 1][0] < t[i][1]:
            # result.append([t[i][0], max(t[i][1], t[i+1][1])])
            a = t.pop(i)
            b = t.pop(i)
            t.insert(i, [a[0], max(a[1], b[1])])

        else:
            result.append([t[i][0], t[i][1]])
            t.pop(i)
    else:
        result.append([t[i][0], t[i][1]])
        t.pop(i)

print(result)
sum = 0
for time in result:
    sum  = sum + (time[1] - time[0])

print(sum)





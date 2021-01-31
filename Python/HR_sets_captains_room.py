# set
# k = input()
# rn = list(input().split())

k = 5
rn = list('1 2 3 6 5 4 4 2 5 3 6 1 6 5 3 2 4 1 2 5 1 4 3 6 8 4 3 1 5 6 2'.split())

rn1 = set() # everything
rn2 = set() # without captain

for i in rn:
    if i in rn1:
        rn2.add(i)
    else:
        rn1.add(i)

print(rn1.difference(rn2).pop())

# dict
dic1 = dict()
for i in rn:
    try:
        dic1[i] = dic1[i] + 1
    except KeyError:
        dic1[i] = 1

print(list(dic1.keys())[list(dic1.values()).index(1)])
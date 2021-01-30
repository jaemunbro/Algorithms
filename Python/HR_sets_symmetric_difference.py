# 20201-01-29
m_num = input()
m = set(map(int, input().split()))
n_num = input()
n = set(map(int, input().split()))

mn = m.union(n)
mn_intersect = m.intersection(n)
mn_result = sorted(mn.difference(mn_intersect))

for i in mn_result:
    print(i)
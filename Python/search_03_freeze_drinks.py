# x-> n, y-> m
n, m = map(int, input().split())

# draw graph
graph = []
for i in range(n):
    graph.append(list(map(int, input())))

def dfs(x, y):
    # 범위 벗어나면 종료
    if x < 0 or x >= n or y < 0 or y >= m:
        return False

    if graph[x][y] == 0:
        graph[x][y] == 1
        #상하좌우 모두 재귀
        dfs(x-1, y)
        dfs(x, y-1)
        dfs(x+1, y)
        dfs(x, y+1)
        return True
    return False

# 음료수 채우기
result = 0
for i in range(n):
    for j in range(m):
        if dfs(i, j) == True:
            result += 1

print(result)

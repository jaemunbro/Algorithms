# x-> n, y-> m
n, m = map(int, input().split())

# draw graph
graph = []
for i in range(n):
    graph.append(list(map(int, input())))


def dfs(x, y):
    # quit when it's out of range
    if x < 0 or x >= n or y < 0 or y >= m:
        return False

    if graph[x][y] == 0:
        graph[x][y] = 1
        # recursive on every 4 directions
        dfs(x-1, y)
        dfs(x, y-1)
        dfs(x+1, y)
        dfs(x, y+1)
        return True
    return False

# freeze drinks
result = 0
for i in range(n):
    for j in range(m):
        if dfs(i, j) == True:
            result += 1

print(result)


# tried once more
class Solution02:
    def dfs(graph, x, y):
        # mark the node
        graph[x][y] = 1

        if x+1 <= m-1:
            if graph[x+1][y] == 0:
                dfs(graph, x+1, y)
        if x-1 >= 0:
            if graph[x-1][y] == 0:
                dfs(graph, x-1, y)
        if y+1 <= n-1:
            if graph[x][y+1] == 0:
                dfs(graph, x, y+1)
        if y-1 >= 0:
            if graph[x][y-1] == 0:
                dfs(graph, x, y-1)

    result = 0
    for i in range(m):
        for j in range(n):
            if graph[i][j] == 0:

                result += 1
                # print(graph)
                dfs(graph, i, j)


# Another Try
graph = [[0, 0, 1, 0, 0],
         [1, 1, 1, 0, 1],
         [0, 1, 1, 1, 1]]

result = 0
def dfs(x, y):
    # 방문처리
    graph[x][y] = 1
    # 상하좌우 탐색
    # -1, 0
    # 1, 0
    # 0, 1
    # 0, -1
    print(x, y)
    if x-1 >= 0:
        if graph[x-1][y] == 0:
            dfs(x-1,y)
    if x+1 < n:
        if graph[x+1][y] == 0:
            dfs(x+1,y)
    if y-1 >= 0:
        if graph[x][y-1] == 0:
            dfs(x,y-1)
    if y+1 < m:
        if graph[x][y+1] == 0:
            dfs(x,y+1)
    # 이동할 곳 있으면 -> stack
    # 없으면 끝

result = 0
for i in range(n):
    for j in range(m):
        if graph[i][j] == 0:
            dfs(i,j)
            result += 1

print(result)







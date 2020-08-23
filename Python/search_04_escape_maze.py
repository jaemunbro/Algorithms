
from collections import deque
'''
graph = 
1 0 1 0 1 0
1 1 1 1 1 1
0 0 0 0 0 1
1 1 1 1 1 1 
'''

# size of maze n*m, 4 <= m,n <= 200
n,m = map(int, input().split())

graph = []
for i in range(n):
    # map to integer -> list
    graph.append(list(map(int, input())))

# movement right, left, up, down
move_x = [1, 0, -1, 0]
move_y = [0, 1, 0, -1]

# basic bfs
def bfs(x, y):
    queue = deque()
    queue.append((x, y))

    while queue:
        x, y = queue.popleft()

        for i in range[4]:
            next_x = x + move_x[i]
            next_y = y + move_y[i]
            if next_x < 0 or next_x >= n or next_y < 0 or next_y >= m:
                continue
            if graph[next_x][next_y] == 0:
                continue
            if graph[next_x][next_y] == 1:
                graph[next_x][next_y] = graph[x][y] + 1
                queue.append((next_x,next_y))
    return graph[n-1][m-1]

print(bfs(0,0))




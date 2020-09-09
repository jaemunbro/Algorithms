
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


class solution2:
    # n, m = map(int, input().split())
    n, m = 5, 5
    graph = []

    for i in range(n):
        # graph.append(list(map(int, input())))
        graph.append(list(map(int, '11111')))

    '''
    skip all the 0, only with 1
    get to (n,m)
    
    BFS 
    queue(deque) library
    
    graph[0][0]
    if my next destination is in graph, good to go
      x, y
      x > n-1 (the index of graph)
      x < 0
      y ...
      
      if it's 1:
        x+1, y
        y, y+1
        x-1, y
        y, y-1
      
      add 1 counter for the step.
    
    queue = deque((0, 0))
    
    counter = 1 ->  2 ->  3
    queue 0,0 -> 0,1 -> 0,2 
    remove queue
    
    counter = 1-> 2-> 3
    105
    234
    305 
    
    order
    queue = [0,0], [0,1], [1,1], [0,2], [2,1]
    
    queue [0,0] -> 1
    [0,1] -> 2
    [1,1], [0,2] -> 3
    
    '''
    from collections import deque

    def bfs(x, y, org_node):
        if x > n-1 or x < 0 or y > m-1 or y <0 or (x==0 and y ==0):
            return
        if graph[x][y] == 1:
            queue.append([x,y])
            graph[x][y] = org_node + 1

    queue = deque()
    queue.append([0,0])
    counter = 0

    while queue:
        node = queue.popleft() # (x,y)
        x = node[0]
        y = node[1]

        bfs(x+1, y, graph[x][y])
        bfs(x-1, y, graph[x][y])
        bfs(x, y+1, graph[x][y])
        bfs(x, y-1, graph[x][y])
        print(graph)

        if x == m-1 and y == n-1:
            print(graph[x][y])
            break



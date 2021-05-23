''' dfs(depth first search)
    data strucrue : stack
    implement with recursive function

    Time Complexity : O(N)
    '''

# nodes : two dimensinal list
graph = [
    [],
    [2, 3, 8],
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7]
]
# node visited information : one dimesional list
visited = [False] * 9

def dfs(graph, v, visited):
    # mark visited node
    visited[v] = True
    print(v, end=' ')

    # reculsively visit connected nodes from current node
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

dfs(graph, 1, visited)


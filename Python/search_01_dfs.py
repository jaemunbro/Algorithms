''' dfs(depth first search)
    stack 구조. 재귀 함수로 구현한다.
    O(N) 시간 소요
    '''
# 노드 연결 정보 : 2차원 리스트
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
# 각 노드가 방문된 정보 : 1차원 리스트
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


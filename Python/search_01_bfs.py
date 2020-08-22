'''
bfs breadth first search
큐 활용
O(N) 시간 소요 / 일반적으로 dfs보다 조금 더 빠르게 동작
'''
from collections import deque

def bfs(graph, start, visited):
    queue = deque([start])
    visited[start] = True

    #큐가 빌 때까지
    while queue:
        #큐에서 하나 뽑아서
        v = queue.popleft()
        print(v, end=' ')

        # 해당 원소와 연결된, 아직 방문하지 않은 원소 삽입
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True


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

bfs(graph, 1, visited)

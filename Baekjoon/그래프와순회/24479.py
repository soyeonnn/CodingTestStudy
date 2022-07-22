def dfs(graph, v, visited):
    # 현재 노드를 방문 처리
    visited[v] = True
    visit_order.append(v)
    # 현재 노드와 연결된 다른 노드를 재귀적으로 방문
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

import sys
input = sys.stdin.readline
n,m,r = map(int, input().split())
graph = []
for i in range(n + 1):
    graph.append([])

visited = [False] * (n+1)
visit_order = []

for i in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(n + 1):
    graph[i].sort()
    
dfs(graph, r, visited)

for i in range(1, n+1):
    if i in visit_order:
        print(visit_order.index(i) + 1)
    else:
        print(0)
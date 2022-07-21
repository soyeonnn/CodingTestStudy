from collections import deque

def ice_track(graph: list, start: tuple, visited: list, n, m):
    queue = deque()
    queue.append(start)
    
    while queue:
        visit = queue.popleft()
        visited[visit[0]][visit[1]] = 1
        
        if visit[0] + 1 < n and graph[visit[0] + 1][visit[1]] == 0 and visited[visit[0] + 1][visit[1]] == 0:
            queue.append((visit[0] + 1, visit[1]))
            visited[visit[0] + 1][visit[1]] = 1
            
        if visit[1] + 1 < m and graph[visit[0]][visit[1] + 1] == 0 and visited[visit[0]][visit[1] + 1] == 0:
            queue.append((visit[0], visit[1] + 1))
            visited[visit[0]][visit[1] + 1] = 1
            
        if visit[1] - 1 >= 0 and graph[visit[0]][visit[1] - 1] == 0 and visited[visit[0]][visit[1] - 1] == 0:
            queue.append((visit[0], visit[1] - 1))
            visited[visit[0]][visit[1] - 1] = 1
            
        if visit[0] - 1 >= 0 and graph[visit[0] - 1][visit[1]] == 0 and visited[visit[0] - 1][visit[1]] == 0:
            queue.append((visit[0] - 1, visit[1]))
            visited[visit[0] - 1][visit[1]] = 1


n, m = map(int, input().split())
ice_arr = []
visited = [[0 for _ in range(m)] for _ in range(n)]
ice_count = 0

for i in range(n):
    string = input()
    ice_one = []
    for j in string:
        ice_one.append(int(j))
    ice_arr.append(ice_one)

for i in range(n):
    for j in range(m):
        if ice_arr[i][j]:
            visited[i][j] = 1
            continue
        else:
            if visited[i][j]:
                continue
            else:
                ice_track(ice_arr, (i,j), visited, n, m)
                ice_count += 1

print(ice_count)
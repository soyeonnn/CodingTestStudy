from collections import deque

def miro(x: int, y: int):
    count = 2
    while queue:
        visit = queue.popleft()
        visited[visit[0]][visit[1]] = 1
        flag = 0
        moves = [(0, 1), (1, 0), (0, -1), (-1, 0)]
        for move in moves:
            nx = visit[0] + move[0]
            ny = visit[1] + move[1]
            
            if nx <= -1 or nx >= n or ny <= -1 or ny >= m:
                continue
            
            if visited[nx][ny] or (not graph[nx][ny]):
                visited[nx][ny] = 1
                continue
            else:
                if nx == n-1 and ny == m-1:
                    print(visit[0], visit[1])
                    return count
                queue.append((nx, ny))
                visited[nx][ny] = 1
                flag = 1
        if flag:    
            print(visit[0], visit[1])
            count += 1

n,m = map(int, input().split())
graph = []
visited = [[0 for _ in range(m)] for _ in range(n)]

for i in range(n):
    graph.append(list(map(int, input())))

queue = deque()
count = 0
queue.append((0,0))

print(miro(0,0))

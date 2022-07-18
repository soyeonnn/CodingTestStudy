# 동, 북, 서, 남
dx = [0, -1, 0, 1]
dy = [1, 0, -1, 0]

# 현재 위치
x, y = 1, 1

for i in range(4):
    nx = x + dx[i]
    ny = y + dy[i]
    print(nx, ny)
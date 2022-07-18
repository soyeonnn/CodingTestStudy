string = input()
column_ch = ['a','b','c','d','e','f','g','h']
y, x = column_ch.index(string[0]) + 1, int(string[1])

dx = [-2, -1, 1, 2, 2, 1, -1, -2]
dy = [1, 2, 2, 1, -1, -2, -2, -1]

count = 0
for i in range(8):
    nx = x + dx[i]
    ny = y + dy[i]
    
    if nx < 1 or ny < 1 or nx > 8 or ny > 8:
        continue
    count += 1

print(count)
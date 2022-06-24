h,w = tuple(map(int, input().split()))
n = int(input())
arr = [[0 for _ in range(w+1)] for _ in range(h+1)]

for i in range(n):
    l,d,x,y = tuple(map(int, input().split()))
    for j in range(l):
        if d == 0:
            arr[x][y] = 1
            y += 1
        else:
            arr[x][y] = 1
            x += 1


for i in range(1,h+1):
    for j in range(1,w+1):
        print(arr[i][j], end=' ')
    print()
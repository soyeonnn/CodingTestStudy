arr = [list(map(int, input().split())) for _ in range(19)]
num = int(input())

for i in range(num):
    x,y = tuple(map(int, input().split()))
    for j in range(19):
        if arr[x-1][j] == 0:
            arr[x-1][j] = 1
        else:
            arr[x-1][j] = 0
        
        if arr[j][y-1] == 0:
            arr[j][y-1] = 1
        else:
            arr[j][y-1] = 0
    

for i in arr:
    for j in i:
        print(j, end=' ')
    print()
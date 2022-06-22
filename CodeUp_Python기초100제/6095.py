d = []

for i in range(20):
    d.append([])
    for j in range(20):
        d[i].append(0)

n = int(input())
for i in range(n):
    x,y = input().split()
    d[int(x)][int(y)] = 1

for i in range(1,20):
    for j in range(1,20):
        print(d[i][j], end=' ')
    print()
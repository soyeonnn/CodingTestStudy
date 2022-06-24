arr = [list(map(int, input().split())) for _ in range(10)]

for i in arr:
    for j in i:
        print(j, end=' ')
    print()
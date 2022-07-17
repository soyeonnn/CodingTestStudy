m = int(input())
n = int(input())

arr = []
for i in range(m, n+1):
    flag = 0
    for num in range(2, i):
        if i % num == 0:
            flag = 1
            break
    if flag == 0 and i != 1:
        arr.append(i)

if len(arr) == 0:
    print(-1)
else:
    print(sum(arr), arr[0], sep='\n')
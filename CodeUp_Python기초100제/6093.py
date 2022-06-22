n = int(input())
arr = input().split()

for i in range(n):
    arr[i] = int(arr[i])
    
for i in range(n-1,-1,-1):
    print(arr[i], end=' ')
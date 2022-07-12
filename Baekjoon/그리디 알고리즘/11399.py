num = int(input())
arr = list(map(int, input().split()))
arr.sort()

result = 0
for i in range(len(arr)):
    result += sum(arr[0:i+1])
    
print(result)
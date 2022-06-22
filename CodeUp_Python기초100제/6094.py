num = int(input())

arr = input().split()

for i in range(num):
    arr[i] = int(arr[i])
    
min = arr[0]

for i in range(num):
    if min > arr[i]:
        min = arr[i]
        
print(min)


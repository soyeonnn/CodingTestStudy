num = int(input())
arr = []
for i in range(num):
    arr.append(list(input().split()))
    
for i in range(len(arr)):
    string = arr[i][1]
    for char in string:
        print(char * int(arr[i][0]), end='')
    print()
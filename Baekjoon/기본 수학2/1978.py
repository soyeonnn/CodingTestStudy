num = int(input())
arr = list(map(int, input().split()))

count = 0
for item in arr:
    flag = 0
    for i in range(2, item):
        if item % i == 0:
            flag = 1
            break
    if flag == 0 and item != 1:
        count += 1

print(count)
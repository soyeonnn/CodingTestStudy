num = int(input())
scary_arr = list(map(int, input().split()))
scary_arr.sort()

count = 0
while len(scary_arr) > 0:
    max_num = scary_arr.pop()
    for i in range(max_num-1):
        scary_arr.pop()
    count += 1

print(count)
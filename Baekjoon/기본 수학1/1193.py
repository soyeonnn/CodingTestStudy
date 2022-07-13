num = int(input())

count = 0
start_num = 0
while True:
    if ((count * (count + 1)) / 2) + 1 == num:
        start_num =  int(((count * (count + 1)) / 2) + 1)
    elif ((count * (count + 1)) / 2) + 1 > num:
        start_num =  int((((count - 1) * count) / 2) + 1)
        break
    count += 1

result_index = num - start_num + 1
index = 1

if count % 2 != 0:
    for j in range(count, 0, -1):
        if index == result_index:
            print(j, count - j + 1, sep='/')
        index += 1
else:
    for j in range(1, count + 1, 1):
        if index == result_index:
            print(j, count - j + 1, sep='/')
        index += 1

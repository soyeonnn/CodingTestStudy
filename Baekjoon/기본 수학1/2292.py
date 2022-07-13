num = int(input())

count = 0
while True:
    if (3 * count * (count + 1)) + 1 >= num:
        break
    count += 1

print(count + 1)

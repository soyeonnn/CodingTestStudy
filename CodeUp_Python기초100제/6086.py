n = int(input())

sum = 0
i = 1

while sum <= n:
    if sum + i >= n:
        sum += i
        break
    sum += i
    i += 1

print(sum)
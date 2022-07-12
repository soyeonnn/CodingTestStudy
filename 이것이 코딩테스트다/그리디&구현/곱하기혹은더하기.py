string = input()
result = 0

for i in range(len(string)):
    if int(string[i]) == 0 or result == 0:
        result += int(string[i])
    else:
        result *= int(string[i])

print(result)
    
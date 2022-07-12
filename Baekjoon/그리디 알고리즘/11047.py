n, k = map(int, input().split())
arr = [int(input()) for i in range(n)]
arr = arr[::-1]

result = 0
for coin in arr:
    result += k // coin
    k %= coin

print(result)
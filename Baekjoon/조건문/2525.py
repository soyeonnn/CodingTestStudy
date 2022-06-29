a,b = tuple(map(int, input().split()))
c = int(input())

result_m = a * 60 + b + c

print(result_m // 60 % 24, result_m % 60)
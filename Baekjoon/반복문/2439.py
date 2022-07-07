# 내 풀이
n = int(input())

for i in range(1, n + 1):
    print(' ' * (n - i), end='')
    print('*' * i)


# 빠른 풀이
x=int(input())

for i in range(1, x + 1):
    print(' ' * (x-i) + '*' * i)
# 내 코드
import sys
input = sys.stdin.readline

num = int(input())

div_num = num % 5
if div_num == 0:
    print(num // 5)
elif div_num == 1:
    if (num // 5) - 1 < 0:
        print(-1)
    else:
        print((num // 5) - 1 + 2)
elif div_num == 2:
    if (num // 5) - 2 < 0:
        print(-1)
    else:
        print((num // 5) - 2 + 4)
elif div_num == 3:
    print((num // 5) + 1)
elif div_num == 4:
    if (num // 5) - 1 < 0:
        print(-1)
    else:
        print((num // 5) - 1 + 3)


# 짧은 코드
N = int(input())
cnt = 0
while True:
    if (N % 5) == 0:
        cnt = cnt + (N // 5)
        print(cnt)
        break
    N -= 3
    cnt += 1
    if N < 0:
        print(-1)
        break
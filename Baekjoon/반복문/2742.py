# 내 풀이
num = int(input())

[print(i) for i in range(num, 0, -1)]


# 시간 줄이는 코드
n=int(input())
print("\n".join(map(str, range(n, 0, -1))))


# 내 풀이
h, m = tuple(map(int, input().split()))

if m >= 45:
    print(h, m-45)
else:
    if h == 0:
        print(23, 60-(45-m))
    else:
        print(h-1, 60-(45-m))
        

# 간단 풀이

# h * 60 + m - 45 (45분 전의 시간)
# 7시 45분이었으면 420+45-45 = 420
# 420 // 60 % 24 = 7  420 % 60 = 0
# 7시 0분이 된다.

h, m = tuple(map(int, input().split()))

pre_minute = h * 60 + m - 45

print(pre_minute // 60 % 24, pre_minute % 60)
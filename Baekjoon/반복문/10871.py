# 내 풀이
n, x = tuple(map(int, input().split()))
arr = list(map(int, input().split()))

for item in arr:
    if item < x:
        print(item, end=' ')


# 빠른 풀이
a,b = map(int,input().split())
score = [x for x in input().split() if int(x) < b]
print(' '.join(score))
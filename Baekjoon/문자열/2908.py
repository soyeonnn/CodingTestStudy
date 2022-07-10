# 내풀이
a,b = tuple(map(list, input().split()))
a = "".join(reversed(a))
b = "".join(reversed(b))

if int(a) > int(b):
    print(a)
else:
    print(b)



# 다른 풀이
a,b = input().split()

print(max(a[::-1], b[::-1]))
num = int(input())

for i in range(num):
    a,b = tuple(map(int, input().split(',')))
    print(a+b)
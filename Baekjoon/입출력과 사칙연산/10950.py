num = int(input())
result = []

for i in range(num):
    a,b = tuple(map(int, input().split()))
    result.append(a+b)
    
for i in result:
    print(i)
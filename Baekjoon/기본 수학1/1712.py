a,b,c = tuple(map(int, input().split()))

if c-b == 0 or a / (c-b) < 0 :
    print(-1)
else:  
    print(int(a / (c-b) + 1))
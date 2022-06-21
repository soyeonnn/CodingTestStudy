r,g,b = input().split()

r = int(r)
g = int(g)
b = int(b)

count = 0
for i in range(0,r):
    for j in range(0,g):
        for k in range(0,b):
            print(i,j,k)
            count += 1
print(count)
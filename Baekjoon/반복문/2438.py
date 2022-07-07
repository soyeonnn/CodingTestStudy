# 내 풀이
n = int(input())

for i in range(n):
    star = 0
    while star <= i:
        print("*", end='')
        star += 1
    print()
    

# 빠른 풀이
for i in range(1,int(input())+1): 
    print('*' * i)
num = int(input())

sum = 0
for i in range(1,num+1):
    sum += i
    
print(sum)


# 간단 풀이
print (sum(range(int(input())+1)))
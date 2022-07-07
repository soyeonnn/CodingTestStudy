# 내 풀이
n = input()
init_num = n
cycle = 0

while True:
    if len(n) == 1:
        new_num = []
        new_num.append('0')
        new_num.append(n)
        n = "".join(new_num)
        init_num = n

    sum = str(int(n[0]) + int(n[1]))
    new_num  = []
    new_num.append(n[1])
    
    if len(sum) == 1:
        new_num.append(sum)
    else:
        new_num.append(sum[1])
        
    n = "".join(new_num)
    
    cycle += 1
    
    if n == init_num:
        break

print(cycle)


# 짧은 풀이
num = int(input())
compare_num = num

cycle = 0

while True:
    compare_num = (compare_num % 10) * 10 + (compare_num // 10 + compare_num % 10) % 10
    cycle += 1
    
    if compare_num == num:
        break
        
print(cycle)

# 10으로 나눈 나머지 -> 십의 자리
# 10으로 나눈 몫 + 10으로 나눈 나머지 -> 일의 자리
# 내 풀이
import collections

all_mul = str(int(input()) * int(input()) * int(input()))
mul_dict = collections.Counter(all_mul)
return_list = []

return_list.append(mul_dict['0'])

for i in range(1, 10):
    if str(i) not in mul_dict:
        return_list.append(0)
    else:
        return_list.append(mul_dict[str(i)])

for i in return_list:
    print(i)


# 빠른 풀이
all_mul = list(map(int, (str(int(input()) * int(input()) * int(input())))))

for i in range(10):
    print(all_mul.count(i))
import collections

# num과 num의 각 자리수 더하는 함수
def d(num: int) -> int:
    return_num = num
    num_string = str(num)

    for i in range(len(num_string)):
        return_num += int(num_string[i])
    
    return int(return_num)

dict = collections.defaultdict(int)
for i in range(1,10001):
    dict[d(i)] += 1

for i in range(1, 10001):
    if i not in dict:
        print(i)
import sys

def hansoo_verify(num: int) -> bool:
    # 두자리 숫자까지는 무조건 한수
    if num < 100:
        return True

    # 세자리 이상의 숫자인 경우 한수 판별
    num_string = str(num)
    diff = int(num_string[1]) - int(num_string[0])

    for i in range(1, len(num_string)-1):
        compare_diff = int(num_string[i+1]) - int(num_string[i])
        if compare_diff != diff:
            return False
    return True
        
input = sys.stdin.readline
num = int(input())

count = 0
for i in range(1, num+1):
    if hansoo_verify(i):
        count += 1

print(count)
import sys
import math

input = sys.stdin.readline

def is_prime_num(n: int) -> bool:
    if n == 1:
        return False
    for i in range(2, int(math.sqrt(n))+1): # n의 제곱근을 정수화 시켜준 후 + 1
        if n % i == 0:
            return False
    return True

m,n = map(int, input().split())

for i in range(m, n+1):
    if is_prime_num(i):
        print(i)
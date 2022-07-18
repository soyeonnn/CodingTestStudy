import sys
input = sys.stdin.readline

def is_prime_num(n: int) -> int:
    if n == 1:
        return 1
    
    max_num = 2 * n
    sieve = [True] * max_num

    m = int(max_num ** 0.5)
    for i in range(2, m + 1):
        if sieve[i] == True:           # i가 소수인 경우 
            for j in range(i+i, max_num, i): # i이후 i의 배수들을 False 판정
                sieve[j] = False

    count = 0
    for i, item in enumerate(sieve):
        if item and i > n:
            count += 1
    
    return count

while True:
    num = int(input())
    if num == 0:
        break
    else:
        print(is_prime_num(num))
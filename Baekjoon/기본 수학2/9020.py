def prime_list(num: int) -> list:
    if num == 1:
        return []
    else:
        num_list = [True] * num
        m = int(num ** 0.5)
        
        for i in range(2, m+1):
            if num_list[i]:
                for j in range(i+i, num, i):
                    num_list[j] = False
    return [i for i in range(2, num) if num_list[i]]

n = int(input())

for i in range(n):
    num = int(input())
    num_prime = prime_list(num)
    
    index_1 = len(num_prime) // 2
    index_2 = len(num_prime) // 2

    while True:
        if len(num_prime) == 0 or index_1 <= 0 or index_2 >= len(num_prime):
            break
        if num_prime[index_1] + num_prime[index_2] == num:
            print(num_prime[index_1], num_prime[index_2])
            break
        elif num_prime[index_1] + num_prime[index_2] > num:
            index_1 -= 1
        else:
            index_2 += 1
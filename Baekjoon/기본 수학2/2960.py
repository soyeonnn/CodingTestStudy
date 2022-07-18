import collections
import copy

n,k = map(int, input().split())
num_q = collections.deque()

for i in range(2, n+1):
    num_q.append(i)

remove_count = 0
prime_num = []
while len(num_q) > 0:
    num = num_q.popleft()
    remove_count += 1
    
    if remove_count == k:
        print(num)
        break
    
    for item in copy.deepcopy(num_q):
        if item % num == 0:
            num_q.remove(item)
            remove_count += 1
        if remove_count == k:
            print(item)
            break
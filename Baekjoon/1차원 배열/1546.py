num = int(input())
num_list = list(map(int, input().split()))

max_score = max(num_list)

new_score = [num_list[i] / max_score * 100 for i in range(num)]

print(sum(new_score) / num)
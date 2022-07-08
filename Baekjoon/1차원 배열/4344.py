num = int(input())
arr = []

for i in range(num):
    score_list = list(map(int, input().split()))
    arr.append(score_list)

for score_list in arr:   
    for j in range(score_list[0]):
        avg = sum(score_list[1:]) / (len(score_list) - 1)
        high_avg_count = len([score_list[i] for i in range(1,len(score_list)) if score_list[i] > avg])
    print("{:.3f}%".format(high_avg_count / score_list[0] * 100))
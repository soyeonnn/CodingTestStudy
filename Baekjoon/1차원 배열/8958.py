num = int(input())

score_sum = 0
for i in range(num):
    string = list(input())
    score = 1
    for item in string:
        if item == 'X':
            score = 1
        else:
            score_sum += score
            score += 1
    
    print(score_sum)
    score_sum = 0
            

# 내풀이
import collections

dice = list(map(int, input().split()))
dict_dice = collections.Counter(dice)

for item in dice:
    if dict_dice[item] == 3:
        result = 10000 + item * 1000
        break
    elif dict_dice[item] == 2:
        result = 1000 + item * 100
        break
    else:
        result = max(dice) * 100

print(result)
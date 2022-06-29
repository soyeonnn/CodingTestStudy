# # 내풀이
# import collections

# dice = list(map(int, input().split()))
# dict_dice = collections.Counter(dice)

# for item in dice:
#     if dict_dice[item] == 3:
#         result = 10000 + item * 1000
#         break
#     elif dict_dice[item] == 2:
#         result = 1000 + item * 100
#         break
#     else:
#         result = max(dice) * 100

# print(result)


# 간단한 풀이
lst = sorted(list(map(int, input().split())))

if len(set(lst)) is 1:
    print(10000 + lst[0]*1000)
elif len(set(lst)) is 2:
    print(1000 + lst[1]*100)
else:
    print(lst[2]*100)
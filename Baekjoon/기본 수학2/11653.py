divide_num = int(input())

d = 2
while d <= divide_num:
    if divide_num % d == 0:
        print(d)
        divide_num = divide_num / d
    else:
        d = d + 1
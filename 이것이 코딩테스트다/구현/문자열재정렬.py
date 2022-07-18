string = input()

num_sum = 0
char_list = []
for char in string:
    if char.isdigit():
        num_sum += int(char)
    else:
        char_list.append(char)

char_list.sort()
print("".join(char_list), num_sum, sep='')
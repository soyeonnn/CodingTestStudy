# 내 풀이
string = input()
string_list = [-1 for i in range(26)]

for i, item in enumerate(string):
    if string_list[ord(item) - 97] == -1:
        string_list[ord(item) - 97] = i
    
[print(i, end=' ') for i in string_list]


# 빠른 풀이
string = input()
alphabet = "abcdefghijklmnopqrstuvwxyz"
for i in alphabet:
    print(string.find(i), end = ' ')
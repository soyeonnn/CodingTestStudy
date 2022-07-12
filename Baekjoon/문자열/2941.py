# 내 풀이
from collections import deque

string = input()
string = deque(string)
cro_string = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

word_count = 0
while len(string) > 0:
    if len(string) >= 3:
        word1 = string.popleft()
        word2 = string.popleft()
        word3 = string.popleft()
    elif len(string) == 2:
        word1 = string.popleft()
        word2 = string.popleft()
        word3 = ''
    else:
        word1 = string.popleft()
        word2 = ''
        word3 = ''
    
    if word1+word2 in cro_string:
        word_count += 1
        if word3 != '':
            string.appendleft(word3)
    elif word1+word2+word3 in cro_string:
        word_count += 1
    else:
        if word2 != '':
            string.appendleft(word3)
            string.appendleft(word2)
        word_count += 1
    
    
print(word_count)


# 다른 풀이
cro_list = ['c=','c-','dz=','d-','lj','nj','s=','z=']
string = input()
for item in cro_list:
    string = string.replace(item,' ')
    
print(len(string))
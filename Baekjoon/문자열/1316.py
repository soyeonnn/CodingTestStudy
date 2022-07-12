# 내풀이
def group_word(string: str) -> bool:
    
    for char in string:
        comp_list = []
        for i, com_char in enumerate(string):
            if char == com_char:
                comp_list.append(i)
        
        for j in range(0, len(comp_list)-1):
            if (comp_list[j+1] - comp_list[j]) != 1:
                return False
    
    return True
        
num = int(input())
count = 0

for i in range(num):
    string = input()
    if group_word(string):
        count += 1
print(count)

# 다른 풀이
result = 0
for i in range(int(input())):
    word = input()
    print(sorted(word, key=word.find))
    if list(word) == sorted(word, key=word.find):
        result += 1
print(result)
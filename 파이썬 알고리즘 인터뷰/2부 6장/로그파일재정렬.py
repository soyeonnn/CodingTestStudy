import enum
from typing import List

def reorderLogFiles(logs: List[str]) -> List[str]:
    letter = []
    digit = []
    
    for i, item in enumerate(logs):
        if item.split()[1].isdigit():
            digit.append(item)        
        else:
            letter.append(item)
    
    letter = sorted(letter, key = lambda x : (x.split()[1], x.split()[0]))    

    result = letter + digit
    return result



logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
logs2 = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
print(reorderLogFiles(logs))
print(reorderLogFiles(logs2))
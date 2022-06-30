import collections
from typing import List
import re

def mostCommonWord(paragraph: str, banned: List[str]) -> str:
    # [^패턴] - 패턴이 아닌 경우, ' ' 빈칸으로 바꿔준다.
    # b,b,b 인경우 '' 이렇게 바꾸면 split()이 안되기 때문에 ' '공백으로 바꿔준다.
    string_list = list(re.sub('[^a-zA-Z0-9 ]', ' ', paragraph).split())
    
    for i, item in enumerate(string_list):
        if item == " ":
            del string_list[i]
        else:
            string_list[i] = item.lower()
    
    # Counter 클래스로 바꿔서 각 단어의 등장 횟수를 센다.               
    paragraph_dict = collections.Counter(string_list)
    
    for key in banned:
        del paragraph_dict[key]
    
    return paragraph_dict.most_common(1)[0][0]
    


paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
banned = ["hit"]

paragraph2 = "a, a, a, a, b,b,b,c, c"
banned2 = ["a"]

paragraph3 = "a."
banned3 = []

paragraph4 = "Bob. hIt, baLl"
banned4 = ["bob", "hit"]

print(mostCommonWord(paragraph, banned))
print(mostCommonWord(paragraph2, banned2))
print(mostCommonWord(paragraph3, banned3))
print(mostCommonWord(paragraph4, banned4))
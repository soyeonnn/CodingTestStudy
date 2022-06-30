import collections
from typing import List
import re

def mostCommonWord(paragraph: str, banned: List[str]) -> str:
    # [^패턴] - 패턴이 아닌 경우, ' ' 빈칸으로 바꿔준다.
    # 앞에 r을 붙인 것은 역슬래쉬를 해석하지 않게 하기 위해서이다.
    # \w - 단어문자
    words = [word 
             for word in re.sub(r'[^\w]', ' ', paragraph).lower().split() 
             if word not in banned]
    
    counts = collections.Counter(words)
    
    return counts.most_common(1)[0][0]
    


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
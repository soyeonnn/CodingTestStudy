import collections
from typing import List

def groupAnagrams(strs: List[str]) -> List[List[str]]:
    anagrams = collections.defaultdict(list)
    
    # 단어를 정렬하고 문자열로 바꿔서 딕셔너리에 넣는다.
    for word in strs:
        anagrams[''.join(sorted(word))].append(word)
    
    return list(anagrams.values())

strs = ["ddddddddddg","dgggggggggg"]
print(groupAnagrams(strs))
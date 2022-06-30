from copy import deepcopy
import copy
from typing import List

def groupAnagrams(strs: List[str]) -> List[List[str]]:
    result = []
    i = 0
    
    while len(strs) > 0:
        anagram_list = []
        anagram_list.append(strs.pop(0))
        compare_word = anagram_list[0]
        delete_i = []       
        for i in range(len(strs)):        
            if len(compare_word) == len(strs[i]):
                flag = 1             
                for k in compare_word:
                    if k not in strs[i]:
                        flag = 0
                        break           
                if flag == 1:                
                    anagram_list.append(strs[i])
                    delete_i.append(strs[i])
        for j in delete_i:
            strs.remove(j)
        result.append(anagram_list)
    return result

strs = ["ddddddddddg","dgggggggggg"]
print(groupAnagrams(strs))
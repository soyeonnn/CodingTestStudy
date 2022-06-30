import collections
from typing import Deque

def isPalindrome(s: str) -> bool:
    strs: Deque = collections.deque()
    
    for char in s:
        if char.isalnum():
            strs.append(char.lower())
    
    while len(strs) > 1:
        if strs.popleft() != strs.pop():
            return False
    
    return True

print(isPalindrome("A man, a plan, a canal: Panama"))
print(isPalindrome("race a car"))
print(isPalindrome("0P"))

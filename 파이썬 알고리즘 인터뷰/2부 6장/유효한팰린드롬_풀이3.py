import re

def isPalindrome(s: str) -> bool:
    s = s.lower()
    
    s = re.sub('[^a-z0-9]', '', s)
    
    return s == s[::-1]

print(isPalindrome("A man, a plan, a canal: Panama"))
print(isPalindrome("race a car"))
print(isPalindrome("0P"))

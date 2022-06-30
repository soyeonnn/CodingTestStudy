def isPalindrome(s: str) -> bool:
    strs = []
    
    # 받은 문자열이 영문자나 숫자이면 strs에 소문자로 변환해서 넣는다.
    for char in s:
        if char.isalnum():
            strs.append(char.lower())
            
    # 첫글자와 마지막 글자를 빼가면서 팰린드롬 여부 확인
    while len(strs) > 1:
        if strs.pop(0) != strs.pop():
            return False
    
    return True
    
    

print(isPalindrome("A man, a plan, a canal: Panama"))
print(isPalindrome("race a car"))
print(isPalindrome("0P"))

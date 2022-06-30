def isPalindrome(s: str) -> bool:
    s = s.replace(" ", "")  # 문자열에서 공백 제거
    
    # 문자이거나 숫자인 경우에만 new_string에 추가된다.
    # isalpha() - 영어, 한글이면 true
    # isalnum() - 영어, 한글, 숫자이면 true
    new_string= []
    for i in s:
        if i.isalnum():
            new_string.append(i)
        else:
            continue       
    
    # [0,맨마지막], [1,맨마지막-1] 식으로 확인하면서 다르면 flag가 0이 되고, False return
    flag = 1
    for i in range(len(new_string) // 2):
        if new_string[i].upper() != new_string[len(new_string)-(i+1)].upper():
            flag = 0
            return False

    if flag == 1:
        return True

print(isPalindrome("A man, a plan, a canal: Panama"))
print(isPalindrome("race a car"))
print(isPalindrome("0P"))

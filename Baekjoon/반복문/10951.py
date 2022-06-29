while True:
    try:
        a,b = tuple(map(int, input().split()))
        print(a+b)
    except:
        break
    
## 입력값이 언제 끝나는지 모를 때는 try, except 문을 사용해서 처리!
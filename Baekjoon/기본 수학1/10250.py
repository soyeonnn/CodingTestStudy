num = int(input())

for i in range(num):
    h,w,n = map(int, input().split())
        
    floor = h if n % h == 0 else n % h   
    roon_num = (n-floor) // h + 1   
    
    print(floor * 100 + roon_num)

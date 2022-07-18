n = int(input())
move_char = list(input().split())
x = 1
y = 1

for ch in move_char:
    if ch == 'L' and (y-1) > 0:
        x, y = x, y-1
    elif ch == 'R' and (y+1) < n:
        x, y = x, y+1
    elif ch == 'U' and (x-1) > 0:
        x, y = x-1, y
    elif ch == 'D' and (x+1) < n:
        x, y = x+1, y
        
print(x, y)
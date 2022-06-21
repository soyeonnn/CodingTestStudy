a,b = input().split()

a = bool(int(a))
b = bool(int(b))

print((a and b) or not(a or b))
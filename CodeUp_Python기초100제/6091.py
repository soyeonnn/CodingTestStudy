a,b,c = input().split()

a = int(a)
b = int(b)
c = int(c)

d = 1
while d%a!=0 or d%b!=0 or d%c!=0:
  d += 1
print(d)
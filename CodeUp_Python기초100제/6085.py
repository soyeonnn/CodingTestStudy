w,h,b = input().split()

w = int(w)
h = int(h)
b = int(b)

print(format(w*h*b/8/1024/1024, '.2f') + ' MB')
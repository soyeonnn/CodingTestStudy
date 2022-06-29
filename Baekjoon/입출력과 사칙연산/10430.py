a,b,c = tuple(map(int, input().split()))

print((a+b)%c, ((a%c)+(b%c))%c, (a*b)%c, ((a%c)*(b%c))%c, sep="\n")
a = int(input())
b = input()

print(a*(int(b[2])%100), a*(int(b[1])%100), a*(int(b[0])%100), a*int(b), sep="\n")
# a = input()

# if a == "A":
#     a = 10
# elif a == "B":
#     a = 11
# elif a == "C":
#     a = 12
# elif a == "D":
#     a = 13
# elif a == "E":
#     a = 14
# elif a == "F":
#     a = 15
    
# a = int(a)

# for i in range(1,16):
#     print('%X'%a, '*%X'%i, '=%X'%(a*i), sep='')


a = int(input(),16)

for i in range(1,16):
    print('%X'%a, '*%X'%i, '=%X'%(a*i), sep='')
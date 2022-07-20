num = int(input())

for i in range(num):
    string = input()
    stack  = []
    flag = 1
    for char in string:
        if char == "(":
            stack.append(char)
        elif char == ")":
            if len(stack) == 0:
                print("NO")
                flag = 0
                break
            else:
                stack.pop()
    if len(stack) != 0:
        print("NO")
    elif len(stack) == 0 and flag:
        print("YES")

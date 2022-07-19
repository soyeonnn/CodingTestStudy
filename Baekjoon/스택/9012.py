num = int(input())

for i in range(num):
    string = input()
    for char in string:
        stack  = []
        if char == "(":
            stack.append(char)
        elif char == ")" and len(stack) == 0:
            print("NO")
            continue
        else:
            stack.pop()
        
        if len(stack) == 0 :
            print("YES")

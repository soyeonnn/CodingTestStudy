while True:
    string = input()
    if string == ".":
        break
    else:
        stack = []
        flag = 1
        for char in string:
            if char == ".":
                break
            elif char.isalpha() or char == " ":
                continue
            else:
                if char == "(" or char == "[":
                    stack.append(char)
                else:
                    if len(stack) != 0:
                        if char == ")" and stack[-1] == "(":
                            stack.pop()
                        elif char == ")" and stack[-1] != "(":
                            flag = 0
                            break
                        elif char == "]" and stack[-1] == "[":
                            stack.pop()
                        elif char == "]" and stack[-1] != "[":
                            flag = 0
                            break
                    else:
                        flag = 0
                        print("no")
                        break         
        if len(stack) != 0:
            print("no")
        elif len(stack) == 0 and flag:
            print("yes")
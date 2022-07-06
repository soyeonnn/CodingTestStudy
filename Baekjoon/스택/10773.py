import sys
input = sys.stdin.readline

num = int(input())

stack = []
for i in range(num):
    item = int(input())
    if item == 0:
        stack.pop()
    else:
        stack.append(item)

print(sum(stack))
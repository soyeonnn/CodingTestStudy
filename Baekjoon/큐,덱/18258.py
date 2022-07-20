from collections import deque
import sys

def queue_func(command: list, queue: deque):
    if command[0] == "push":
        queue.append(command[1])
    elif command[0] == "pop":
        if queue:
            print(queue.popleft())
        else:
            print(-1)
    elif command[0] == "front":
        if queue:
            print(queue[0])
        else:
            print(-1)
    elif command[0] == "back":
        if queue:
            print(queue[-1])
        else:
            print(-1)
    elif command[0] == "size":
        print(len(queue))
    else:
        if queue:
            print(0)
        else:
            print(1)

input = sys.stdin.readline
num = int(input())
queue = deque()

for i in range(num):
    command_list = list(input().split())
    queue_func(command_list, queue)
    
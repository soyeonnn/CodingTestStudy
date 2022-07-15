def fib(num: int) -> int:
    if num == 0:
        return 0
    elif num == 1:
        return 1
    else:
        return fib(num-1) + fib(num-2)

num = int(input())

print(fib(num))
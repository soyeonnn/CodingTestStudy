import collections


class MyStack:
    def __init__(self):
        self.q = collections.deque()
        
    def push(self, x: int) -> None:
        self.q.append(x)

    def pop(self) -> int:
        return self.q.pop()

    def top(self) -> int:
        return_value = self.q.pop()
        self.q.append(return_value)
        return return_value

    def empty(self) -> bool:
        if len(self.q) == 0:
            return True
        else:
            return False


obj = MyStack()
print(obj.empty())
import collections

class MyQueue:

    def __init__(self):
        self.q = []

    def push(self, x: int) -> None:
        self.q.append(x)

    def pop(self) -> int:
        return_value = self.q[0]
        new_s = []
        for i in range(1, len(self.q)):
            new_s.append(self.q[i])
        self.q = new_s
        
        return return_value

    def peek(self) -> int:
        return self.q[0]

    def empty(self) -> bool:
        return len(self.q) == 0


# Your MyQueue object will be instantiated and called as such:
obj = MyQueue()
obj.push(1)
obj.push(2)
obj.push(3)
obj.push(4)
print(obj.pop())
obj.push(5)
print(obj.pop())
print(obj.pop())
print(obj.pop())
print(obj.pop())
print(obj.empty())
from re import T


class MyCircularQueue:

    def __init__(self, k: int):
        self.circleQueue = [None] * k
        self.maxLen = k
        self.front = 0
        self.rear = 0

    def enQueue(self, value: int) -> bool:
        if self.circleQueue[self.rear] is None:
            self.circleQueue[self.rear] = value
            self.rear = (self.rear + 1) % self.maxLen
            return True
        return False

    def deQueue(self) -> bool:
        if self.circleQueue[self.front] is None:
            return False
        else:
            self.circleQueue[self.front] = None
            self.front = (self.front + 1) % self.maxLen
            return True

    def Front(self) -> int:
        return -1 if self.circleQueue[self.front] is None else self.circleQueue[self.front]

    def Rear(self) -> int:
        return -1 if self.circleQueue[self.rear - 1] is None else self.circleQueue[self.rear - 1]

    def isEmpty(self) -> bool:
        return self.front == self.rear and self.circleQueue[self.front] is None

    def isFull(self) -> bool:
        return self.front == self.rear and self.circleQueue[self.front] is not None
        
myCircularQueue = MyCircularQueue(3)
print(myCircularQueue.enQueue(1))
print(myCircularQueue.enQueue(2))
print(myCircularQueue.enQueue(3)) 
print(myCircularQueue.enQueue(4)) 
print(myCircularQueue.Rear()) 
print(myCircularQueue.isFull())   
print(myCircularQueue.deQueue())  
print(myCircularQueue.enQueue(4)) 
print(myCircularQueue.Rear())  
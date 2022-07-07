import collections
from multiprocessing.sharedctypes import Value


class ListNode:
    def __init__(self, key = None, value = None):
        self.key = key
        self.value = value
        self.next = None
        
class MyHashMap:

    def __init__(self):
        self.size = 1000
        self.table = collections.defaultdict(ListNode)

    def put(self, key: int, value: int) -> None:
        index = key % self.size
        
        # 인덱스에 노드가 없다면 삽입 후 바로 종료
        if self.table[index].value is None:
            self.table[index] = ListNode(key, value)
            return
        
        # 인덱스에 노드가 존재하는 경우에는 연결 리스트로 연결
        p = self.table[index]
        while p:
            # 해당 키를 가진 노드가 이미 존재하면 값만 바꾼다.
            if p.key == key:
                p.value = value
                return
            if p.next is None:
                break
            p = p.next
        p.next = ListNode(key, value)
        
        
        

    def get(self, key: int) -> int:
        index = key % self.size
        
        if self.table[index].value is None:
            return -1
        
        # 찾는 노드가 존재할 때 일치하는 키 탐색
        p = self.table[index]
        while p:
            if p.key == key:
                return p.value
            p = p.next
        return -1

    def remove(self, key: int) -> None:
        index = key % self.size
        
        if self.table[index].value is None:
            return
        
        # 인덱스의 첫 번 째 노드일 때 삭제 처리
        p = self.table[index]
        if p.key == key:
            self.table[index] = ListNode() if p.next is None else p.next
            return
        
        # 연결 리스트 노드 삭제
        prev = p
        while p:
            if p.key == key:
                prev.next = p.next
                return
            prev, p = p, p.next

obj = MyHashMap()
obj.put(1,1)
obj.put(2,2)
print(obj.get(1))
print(obj.get(3))
obj.put(2,1)
print(obj.get(2))
obj.remove(2)
print(obj.get(2))
import collections
from typing import Collection

class ListNode:
    def __init__(self, key = None, value = None):
        self.key = key
        self.value = value
        self.next = None
        
table = collections.defaultdict(ListNode)

node1 = ListNode(1,1)
table[1] = 1
print(table)
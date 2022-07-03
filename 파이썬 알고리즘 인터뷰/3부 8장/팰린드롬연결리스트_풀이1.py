from typing import List, Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def isPalindrome(self, head: Optional[ListNode]) -> bool:
    q : List = []

    if not head:
        return True
    
    node = head
    # 리스트로 변환한다.
    while node is not None:
        q.append(node.val)
        node = node.next
    
    # 팰린드롬을 판별한다.
    while len(q) > 1:
        if q.pop(0) != q.pop():
            return False
    
    return True
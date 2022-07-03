from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cur = head
        
        while cur and cur.next:
            # 값만 교환한다.
            cur.val, cur.next.val = cur.next.val, cur.val
            cur = cur.next.next
        
        return head
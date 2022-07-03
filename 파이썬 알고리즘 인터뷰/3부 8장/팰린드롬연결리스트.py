from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def isPalindrome(self, head: Optional[ListNode]) -> bool:
        node = head
        node_list = []
        
        while node:
            node_list.append(node.val)
            node = node.next
        
        return node_list[:] == node_list[::-1]
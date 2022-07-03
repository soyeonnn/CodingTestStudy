from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        node = head
        node_list = []
        
        if not head:
            return ListNode('')
        
        while node is not None:
            node_list.append(node.val)
            node = node.next
        
        # 리스트에 넣어서 마지막부터 연결리스트로 변환한다.
        return_node = ListNode(node_list[len(node_list)-1])
        curr_node = return_node
        
        for i in range(len(node_list)-2, -1, -1):
            new_node = ListNode()
            new_node.val = node_list[i]
            curr_node.next = new_node
            curr_node = curr_node.next
        
        return return_node
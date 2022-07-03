from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
    node_list = []
    node = head
     
    # 빈 연결 리스트가 입력된 경우
    if not head:
        return ListNode('')
    else:
    	# 리스트에 넣어서
        while node is not None:
            node_list.append(node.val)
            node = node.next
        
        # 페어끼리 순서를 swap 해준다.
        for  i in range(0, len(node_list), 2):
            if i + 1 >= len(node_list):
                break
            node_list[i], node_list[i+1] = node_list[i+1], node_list[i]
		
    	# swap된 리스트를 연결리스트로 변환한다.
        return_node = ListNode(node_list[0])
        curr_node = return_node
        for i in range(1, len(node_list)):
            new_node = ListNode()
            new_node.val = node_list[i]
            curr_node.next = new_node
            curr_node = curr_node.next
           
        return return_node
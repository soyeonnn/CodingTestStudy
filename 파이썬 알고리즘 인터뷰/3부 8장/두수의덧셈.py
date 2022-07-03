from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
    node1 = l1
    node2 = l2

    node1_num = 0
    node2_num = 0

    # 앞에서부터 자릿수가 10씩 곱해지면서 커진다.
    # 해당 자릿수와 숫자를 곱해서 node1_num에 더해준다.
    digit = 1
    while node1 is not None:
        node1_num += digit * node1.val
        digit *= 10
        node1 = node1.next
      
    digit = 1
    while node2 is not None:
        node2_num += digit * node2.val
        digit *= 10
        node2 = node2.next
     
    num_sum = node1_num + node2_num
    num_sum = str(num_sum)
        
    return_node = ListNode(num_sum[len(num_sum) - 1])
    curr_node = return_node
        
    # 더한 결과를 연결리스트로 변환한다.
    for i in range(len(num_sum) - 2, -1, -1):
        new_node = ListNode()
        new_node.val = num_sum[i]
        curr_node.next = new_node
        curr_node = curr_node.next
        
    return return_node
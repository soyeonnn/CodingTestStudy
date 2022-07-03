from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
    node1 = list1
    node2 = list2
    node_list = []
    
    # 두 개 다 빈 연결리스트가 들어오면 빈 연결리스트를 리턴한다.
    if not node1 and not node2:
        return ListNode(val='')
    
    # 각 연결리스트의 값들을 한 개의 리스트에 추가한다.
    while node1 is not None:
        node_list.append(node1.val)
        node1 = node1.next
    
    while node2 is not None:
        node_list.append(node2.val)
        node2 = node2.next
    
    # 오름차순으로 정렬한다.
    node_list.sort()
    
    # 정렬한 결과를 새로운 연결리스트로 만든다.
    return_node = ListNode(node_list[0])
    curr_node = return_node
    for i in range(1,len(node_list)):
        new_node = ListNode()
        new_node.val = node_list[i]
        curr_node.next = new_node
        curr_node = curr_node.next
    
    return return_node
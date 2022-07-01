from typing import List

def twoSum(nums: List[int], target: int) -> List[int]:
    nums_map = {}
    
    # 값을 키로, 인덱스를 값으로 해 딕셔너리에 저장한다.
    for i, num in enumerate(nums):
        nums_map[num] = i
    
    # 타겟에서 첫번째 수를 뺀 값을 딕셔너리에서 찾는다.
    # 두번째 수의 인덱스가 첫번째 수의 인덱스와 같지 않아야 한다.
    for i, num in enumerate(nums):
        if target - num in nums_map and i != nums_map[target - num]:
            return [i, nums_map[target - num]]

nums = [3,2,4]
target = 6
print(twoSum(nums, target))
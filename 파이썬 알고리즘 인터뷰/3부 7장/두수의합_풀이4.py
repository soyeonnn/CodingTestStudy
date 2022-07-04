from typing import List

def twoSum(nums: List[int], target: int) -> List[int]:
    nums_map = {}
    
    for i, num in enumerate(nums):
        if target - num in nums_map:
            return [nums_map[target - num], i]
        nums_map[num] = i
        
nums = [3,2,4]
target = 5
print(twoSum(nums, target))
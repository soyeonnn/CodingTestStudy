from typing import List

def twoSum(nums: List[int], target: int) -> List[int]:
    for i, item in enumerate(nums):
        if (target - item) in nums:
            if nums.index(target - item) == i:
                continue
            else:
                return [i, nums.index(target - item)]
    

nums = [3,2,4]
target = 6
print(twoSum(nums, target))
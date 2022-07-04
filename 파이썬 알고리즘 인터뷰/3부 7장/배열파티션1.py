from typing import List

def arrayPairSum(nums: List[int]) -> int:
    nums.sort()
    
    return sum(nums[::2])

nums = [1,4,3,2]
print(arrayPairSum(nums))
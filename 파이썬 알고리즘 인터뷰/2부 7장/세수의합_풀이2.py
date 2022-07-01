from typing import List
from unittest import result

def threeSum(nums: List[int]) -> List[List[int]]:
    results = []
    nums.sort()
    
    for i in range(len(nums) - 2):
        # 중복된 값일때는 건너뛴다.
        if i > 0 and nums[i] == nums[i-1]:
            continue
        
        # 간격을 좁혀가면서 합을 계산한다.
        left, right = i+1, len(nums) - 1
        while left < right:
            sum = nums[i] + nums[left] + nums[right]
            
            # 0보다 작으면 더 커져야 하니까 왼쪽을 민다.
            if sum < 0:
                left += 1
            elif sum > 0:
                right -= 1
            else:
                results.append((nums[i], nums[left], nums[right]))
                
                # 양 옆으로 같은 값이 있으면 넘어가기 위한 부분이다.
                while left < right and nums[left] == nums[left + 1]:
                    left += 1
                while left < right and nums[right] == nums[right - 1]:
                    right -= 1
                
                left += 1
                right -= 1
        
    return results
    

nums = [-1,0,1,2,-1,-4]
print(threeSum(nums))
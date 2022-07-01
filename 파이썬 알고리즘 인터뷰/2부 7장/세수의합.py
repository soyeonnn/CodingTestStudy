from typing import List

def threeSum(nums: List[int]) -> List[List[int]]:
    nums.sort()
    return_list = []
    
    for i in range(len(nums) - 2):
        for j in range(i+1, len(nums) - 1):
            for k in range(j+1, len(nums)):
                sum_list = []
                if nums[i] + nums[j] + nums[k] == 0 and [nums[i], nums[j], nums[k]] not in return_list:
                    sum_list.extend([nums[i], nums[j], nums[k]])
                    return_list.append(sum_list)
                    
    return return_list
    

nums = [-1,0,1,2,-1,-4]
print(threeSum(nums))
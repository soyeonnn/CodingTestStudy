import collections
from typing import List

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        num_dict = collections.Counter(nums)
        return_list = []
               
        return_dict = num_dict.most_common(k)

        for i in range(k):
            return_list.append(return_dict[i][0])
        
        return return_list
        

nums = [1,2]
k = 2
solution = Solution()
print(solution.topKFrequent(nums, k))
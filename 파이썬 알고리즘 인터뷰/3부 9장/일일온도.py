from typing import List

class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        return_list = []
        
        for i in range(len(temperatures)):
            j = i + 1
            flag = 1
            while j < len(temperatures):
                if temperatures[i] < temperatures[j]:
                    return_list.append(j - i)
                    flag = 0
                    break
                j += 1
            if flag == 1:
                return_list.append(0)
        
        return return_list
            
temperatures = [73,74,75,71,69,72,76,73]
solution = Solution()
print(solution.dailyTemperatures(temperatures))
import collections

class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        return sum(s in jewels for s in stones)
        
        
        
jewels = "z"
stones = "ZZ"
solution = Solution()
print(solution.numJewelsInStones(jewels, stones))
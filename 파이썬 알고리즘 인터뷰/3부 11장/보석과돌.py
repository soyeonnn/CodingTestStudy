import collections

class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        stone_dict = collections.Counter(stones)
        count = 0
        
        for je in jewels:
            if je in stone_dict:
                count += stone_dict[je]
        
        return count
        
        
        
jewels = "z"
stones = "ZZ"
solution = Solution()
print(solution.numJewelsInStones(jewels, stones))
import collections

class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        freqs = collections.defaultdict(int)
        count = 0
        
        # 비교없이 돌 빈도 수 계산
        for char in stones:
            freqs[char] += 1
                
        # 비교없이 보석의 빈도 수 합산
        for char in jewels:
            count += freqs[char]
                
        return count
        
        
jewels = "z"
stones = "ZZ"
solution = Solution()
print(solution.numJewelsInStones(jewels, stones))
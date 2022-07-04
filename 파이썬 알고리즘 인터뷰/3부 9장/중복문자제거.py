class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        dupli_list = []
        
        for item in s:
            if item not in dupli_list:
                dupli_list.append(item)
        
        dupli_list.sort()
        
        return "".join(dupli_list)
        
s = "cbacdcbc"
solution = Solution()
print(solution.removeDuplicateLetters(s))
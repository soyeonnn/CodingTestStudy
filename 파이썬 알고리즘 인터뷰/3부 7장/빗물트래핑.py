from operator import le
from typing import List

def trap(height: List[int]) -> int:
    left, right = 0, 0
    rain = 0
    max_index = height.index(max(height))
    
    # 최대값이 있는 곳까지
    while right < max_index:
        if left <= right:
            left += 1
            continue
        else:
            if height[left] < height[right]:
                rain += height[right] - height[left]
                left += 1
            else:
                right = left
                left += 1
    
    # 최대값을 만난 이후부터 끝까지
    while right < len(height):
        if right <= left:
            right += 1
            continue
        else:
            if height[right] > height[left]:
                rain += height[right] - height[left]
                right += 1
            else:
                left = right
                right += 1
        
    return rain
        


height = [2,1,0,2]
#height = [0,1,0,2,1,0]
print(trap(height))
def gcd(a: int, b: int) -> int:
    if a % b == 0:
        return b
    else:
        return gcd(b, a % b)
    
print(gcd(192, 162))
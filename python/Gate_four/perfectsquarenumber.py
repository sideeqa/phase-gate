import math

def get_perfect_squares(arr):
    result = []
    
    for num in arr:
        if num >= 0:  # perfect squares are non-negative
            root = math.isqrt(num)  # integer square root
            
            if root * root == num:
                result.append(num)
    
    return result

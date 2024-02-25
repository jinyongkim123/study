def solution(slice, n):
    pizza = n//slice
    if n%slice > 0:
        pizza += 1
    return pizza
    

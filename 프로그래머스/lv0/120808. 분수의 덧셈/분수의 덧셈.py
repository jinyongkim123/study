def gcd(a, b):
    while b > 0:
        a, b = b, a%b
    return a

def solution(numer1, denom1, numer2, denom2):
    parent = denom1 * denom2
    son = numer1 * denom2 + numer2 * denom1
    
    g = gcd(parent, son)
    return [son//g, parent//g]
    
    

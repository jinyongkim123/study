import math
def solution(price):
    if(price >= 500000):
        answer = price*0.8
        
    elif(price >= 300000):
        answer = price*0.9
        
    elif(price >= 100000):
        answer = price*0.95
        
    elif(price < 100000):
        answer = price
        
    # return math.trunc(answer)
    return math.trunc(answer)
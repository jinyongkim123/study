def solution(order):
    answer = 0
    order = str(order)
    order = list(order)
    
    for i in order:
        if int(i) == 0:
            continue
        elif int(i)%3 == 0:
            answer += 1
        
    return answer
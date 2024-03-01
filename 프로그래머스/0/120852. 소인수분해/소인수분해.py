def dec(a):
    for i in range(2, a):
        if a%i != 0:
            pass
        else:
            return 0
    return 1
        
def solution(n):
    sosu = []
    for i in range(2, n+1):
        flag = dec(i)
        if flag == 1:
            sosu.append(i)
    answer = {}
    
    for i in sosu:
        if n%i == 0 and i<=n:
            answer[i] = 1
        else:
            pass
    answer = list(answer)
    return answer
        
        
            
    
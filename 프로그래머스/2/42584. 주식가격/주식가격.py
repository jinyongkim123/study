def solution(prices):
    answer = [0]*len(prices)
    
    for i in range(len(prices)):
        answer[i] = len(prices) - i - 1
        
    for i in range(len(prices)):
        
        for j in range(i+1, len(prices)):
            if prices[i] > prices[j]:
                answer[i] -= answer[j]
                break
        
    return answer
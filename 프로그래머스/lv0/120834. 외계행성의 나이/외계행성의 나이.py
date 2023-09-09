def solution(age):
    alpht = "abcdefghij"
    answer = ""
    
    
    for digit in str(age):
        answer += alpht[int(digit)]
    
    return answer
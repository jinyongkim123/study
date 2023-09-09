def solution(age):
    alpht = "abcdefghij"
    answer = ""
    
    age_str = str(age)
    
    for digit in age_str:
        answer += alpht[int(digit)]
    
    return answer
# def solution(s1, s2):
#     answer = 0
    
#     for i in s1:
#         answer += s2.count(i)
#     return answer

def solution(s1, s2):
    return len(set(s1) & set(s2))
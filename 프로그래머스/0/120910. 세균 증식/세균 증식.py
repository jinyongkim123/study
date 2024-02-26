def solution(n, t):
    answer = n*2
    for i in range(1, t):
        answer *= 2
    return answer
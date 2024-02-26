from itertools import combinations
def solution(numbers):
    answer = []
    sol = []
    answer = list(combinations(numbers, 2))
    
    for i in answer:
        sol.append(i[0]*i[1])
    
    return max(sol)
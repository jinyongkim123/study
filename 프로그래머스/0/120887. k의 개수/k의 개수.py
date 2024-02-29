def solution(i, j, k):
    stack = 0
    for i in range(i, j+1):
        stack += str(i).count(str(k))
    return stack
        
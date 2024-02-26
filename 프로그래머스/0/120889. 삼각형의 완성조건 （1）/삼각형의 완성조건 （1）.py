def solution(sides):
    sides.sort()
    if sides.pop() >= sum(sides): return 2
    return 1 
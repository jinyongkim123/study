def solution(sides):
    sides.sort()
    return 1 if sides.pop() < sum(sides) else 2

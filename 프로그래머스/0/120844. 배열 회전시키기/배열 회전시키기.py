from collections import deque
def solution(numbers, direction):
    answer = deque(numbers)
    
    if direction == 'right':
        answer.appendleft(answer.pop())
    if direction == 'left':
        answer.append(answer.popleft())
    return list(answer)
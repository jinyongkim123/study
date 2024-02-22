from collections import deque
def solution(priorities, location):
    answer = []
    queue = deque((i, j) for i, j in enumerate(priorities))
    
    while(queue):
        go = queue.popleft()
        
        if queue and any(go[1] < i[1] for i in queue):
            queue.append(go)
        else:
            answer.append(go)
    print(answer)
    for i in range(len(answer)):
        if location == answer[i][0]:
            return i+1

        
        
def solution(num_list, n):
    answer = []
    for i in range(len(num_list)//n):
        answer.append([])
    
    pointer = 0
    for i in range(len(answer)):
        for j in range(n):
            answer[i].append(num_list[pointer])
            pointer+=1
            
    return answer
def solution(array, n):
    answer = list(array)
    
    for i in range(len(answer)):
        answer[i] = n-answer[i]
        if answer[i] < 0:
            answer[i] = answer[i] * (-1)
            
    min_value = min(answer)
    
    index_list = []
    for i in range(len(answer)):
        if min_value == answer[i]:
            index_list.append(i)
    sol = array[index_list[0]]
    for i in index_list:
        if array[i] < sol:
            sol = array[i]
    return sol
  
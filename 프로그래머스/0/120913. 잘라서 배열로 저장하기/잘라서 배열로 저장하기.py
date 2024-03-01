def solution(my_str, n):
    my_str = list(my_str)
    print(my_str)
    
    answer = ''
    result = []
    while my_str:
        answer += my_str.pop(0)
        if len(answer) == n:
            result.append(answer)
            answer = ''
    if answer != '':
        result.append(answer)
    
    return result

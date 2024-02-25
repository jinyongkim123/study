def solution(my_string):
    answer = list(my_string)
    reverse_answer = []
    while answer:
        reverse_answer.append(answer.pop())
    
    return ''.join(reverse_answer)
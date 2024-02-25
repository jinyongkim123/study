def solution(my_string):
    answer = list(my_string)
    reverse_answer = []
    while answer:
        reverse_answer.append(answer.pop())
    
    return ''.join(reverse_answer)

def solution(my_string):
    return my_string[::-1]

def solution(my_string):
    return ''.join(list(reversed(my_string)))

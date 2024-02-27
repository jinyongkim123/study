def solution(my_string):
    answer = list(my_string)
    answer = ''.join(answer).lower()
    answer = list(answer)
    answer.sort()
    return ''.join(answer)
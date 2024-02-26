def solution(my_string):
    my_string = list(my_string)
    answer = ''
    for i in range(len(my_string)):
        if my_string[i] != 'a' and my_string[i] != 'e' and my_string[i] != 'i' and my_string[i] != 'o' and my_string[i] != 'u': answer += my_string[i]
    return answer
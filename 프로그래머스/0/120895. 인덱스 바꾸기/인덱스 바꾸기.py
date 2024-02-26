def solution(my_string, num1, num2):
    my_string = list(my_string)
    temp_str = my_string[num1]
    my_string[num1] = my_string[num2]
    my_string[num2] = temp_str
    return ''.join(my_string)
    
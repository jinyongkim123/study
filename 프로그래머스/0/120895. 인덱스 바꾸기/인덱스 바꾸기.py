def solution(my_string, num1, num2):
    c = list(my_string)
    c[num1], c[num2] = c[num2], c[num1]
    return ''.join(c)
    
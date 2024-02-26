def solution(n):
    pizza = 6
    i = 1
    answer = 0
    while True:
        if pizza%n == 0:
            answer = pizza//n
            return pizza//6
        pizza+=6
        
def solution(my_string):
    my_string = list(my_string)
    numbers = []
    for i in my_string:
        if i.isalpha() == False:
            numbers.append(int(i))
    numbers.sort()
    return numbers
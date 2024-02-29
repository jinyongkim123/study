from collections import deque
def solution(my_string):
    answer = []
    temp = ''
    count = 0
    for i in my_string:
        count+=1
        if i.isdigit():
            temp += i
            if  len(my_string) == count:
                answer.append(int(temp))
        else: 
            if temp != '':
                answer.append(int(temp))
                temp = ''
    print(answer)
    return sum(answer)
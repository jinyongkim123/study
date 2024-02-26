def solution(my_string):
    answer = 0
    for i in my_string:
        if ord('1') <= ord(i) and ord('9') >= ord(i):
            answer += ord(i) - ord('0')
    return answer
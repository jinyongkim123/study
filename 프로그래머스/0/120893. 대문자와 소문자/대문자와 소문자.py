def solution(my_string):
    answer = ''
    for i in my_string:
        if ord(i) >= ord('a') and ord(i) <= ord('z'):
            answer += chr(ord(i) - 32)
        if ord(i) >= ord('A') and ord(i) <= ord('Z'):            
            answer += chr(ord(i) + 32)
    return answer

    answer = ''
    for i in my_string:
        if ord(i) >= ord('a') and ord(i) <= ord('z'):
            answer += i.upper()
        if ord(i) >= ord('A') and ord(i) <= ord('Z'):            
            answer += i.lower()
    return answer


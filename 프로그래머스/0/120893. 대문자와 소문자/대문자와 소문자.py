def solution(my_string):
    answer = ''
    print(ord('a'))
    print(ord('A'))
    
    for i in my_string:
        if ord(i) >= ord('a') and ord(i) <= ord('z'):
            answer += chr(ord(i) - 32)
        if ord(i) >= ord('A') and ord(i) <= ord('Z'):            
            answer += chr(ord(i) + 32)

    return answer
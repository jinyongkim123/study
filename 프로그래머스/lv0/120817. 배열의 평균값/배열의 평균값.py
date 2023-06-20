def solution(numbers):
    answer = 0
    for i in numbers:
        answer += i
    result = answer/len(numbers)
    return result
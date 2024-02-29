def solution(n):
    break_ = 1
    i = 1
    while(True):
        i += 1
        break_ *= i
        if break_ == n:
            return i
        elif break_ > n:
            return i-1
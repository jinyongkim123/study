def solution(num, k):
    answer = 0
    a = list(str(num))
    print(a)
    k = str(k)
    for i in a:
        if i==k:
            return a.index(i) + 1
    return -1
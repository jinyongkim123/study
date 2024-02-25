# def solution(array, n):
#     cnt = 0
#     for i in array:
#         if n == i:
#             cnt += 1
#     return cnt

def solution(array, n):
    answer = array.count(n)
    return answer
from itertools import permutations
import math
def solution(numbers):
    li = list(numbers)
    allNums = set()
    for i in range(1, len(numbers)+1):
        permutationList = permutations(li, i)
        for perm in permutationList:
            num = int(''.join(perm))
            allNums.add(num)
    
    count = 0
    for num in allNums:
        
        if isDecimal(num):
            count += 1
            
    return count

def isDecimal(num):
    if (num <= 1):
        return False
    #소수 찾는거 에라토스네체의 체
    for i in range(2, num):
        if num%i == 0:
            return False
    return True
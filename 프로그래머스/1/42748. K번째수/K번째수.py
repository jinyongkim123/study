def solution(array, commands):
    pipe = []
    answer = []
    solutions = []
    for i in commands:
        start = i[0] - 1
        end = i[1]
        sequence = i[2] -1
        pipe = []
        for j in range(start, end):
            pipe.append(array[j])
            
        pipe.sort()
        
        solutions.append(pipe[sequence])
    return solutions
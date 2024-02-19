def solution(N, number):
    dp = [set([int(str(N)*i)]) for i in range(1,9)]
    print(dp)
    
    # N 사용 횟수
    for i in range(8):
        for j in range(i):
            for num1 in dp[j]:            # j 개
                for num2 in dp[i-j-1]:                # i-j 개
                    dp[i].add(num1 + num2)
                    dp[i].add(num1 - num2)
                    dp[i].add(num1 * num2)
                    if num2 != 0:
                        dp[i].add(num1//num2)
        # number가 연산한 결과에 있으면 답으로 반환
        if number in dp[i]:
            return i+1
    return -1
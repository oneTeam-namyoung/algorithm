from collections import deque
import copy

def solution(progresses, speeds):
    answer = []
    time = deque()
    cnt = 0
    
    for i in range(0,len(speeds)):
        if (100-progresses[i])%speeds[i] == 0 :
            time.append((100-progresses[i])//speeds[i])
        elif (100-progresses[i])%speeds[i] != 0 :
            time.append((100-progresses[i])//speeds[i] + 1)
            
    while len(time) > 0 :
        max_num = time[0]
        
        for i in copy.deepcopy(time) :
            if i <= max_num :
                time.popleft()
                cnt += 1
            else :
                break
        
        answer.append(cnt)
        cnt = 0
        
    return answer
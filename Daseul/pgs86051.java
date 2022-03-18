import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        String temp = "";
        Arrays.sort(numbers);
        
        for(int i : numbers){
            temp += Integer.toString(i);
        }
        
        for(int i=0; i<10; i++){
            if(temp.contains(Integer.toString(i)) == false){
                answer += i;
            }
        }
        
        return answer;
    }
}

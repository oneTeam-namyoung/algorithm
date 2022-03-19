import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String stranswer = "";
        String temp = "";
        
        HashMap<String,String> hmap = new HashMap<String,String>();
        hmap.put("zero","0");
        hmap.put("one","1");
        hmap.put("two","2");
        hmap.put("three","3");
        hmap.put("four","4");
        hmap.put("five","5");
        hmap.put("six","6");
        hmap.put("seven","7");
        hmap.put("eight","8");
        hmap.put("nine","9");
        
        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                if(hmap.get(temp) != null){
                    stranswer += hmap.get(temp);
                    temp = "";
                    temp += String.valueOf(s.charAt(i));
                }else{
                    temp += String.valueOf(s.charAt(i));
                }
            }else{
                if(temp != ""){
                    stranswer += hmap.get(temp);
                    temp ="";
                }
                stranswer += String.valueOf(s.charAt(i));
            }
        }
        if(temp != ""){
            stranswer += hmap.get(temp);
        }
        answer = Integer.parseInt(stranswer);
        return answer;
    }
}
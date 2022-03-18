class Solution {
     public String solution(String phone_number) {
        String answer = "";
        int tmp = phone_number.length();
        String num = phone_number.substring(tmp-4,tmp);
         
        return "*".repeat(tmp-4) + num;
     }
}
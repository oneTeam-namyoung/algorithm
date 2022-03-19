import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer;
        
        ArrayList<String> list = new ArrayList<String>();
        HashSet<String> hset = new HashSet<String>(Arrays.asList(report));
        HashMap<String,Integer> hmap = new HashMap<String,Integer>();
        
        for(String i : id_list){
            hmap.put(i,0);
        }
        
        String[] tmp = hset.toArray(new String[0]);
        
        for(int i=0; i<tmp.length; i++){
            list.add(tmp[i].split(" ")[1]);
        }
        
        answer = new int[id_list.length];
        
        for(int i=0; i<id_list.length; i++){
            if(Collections.frequency(list,id_list[i]) >= k){
                for(int j=0; j<tmp.length; j++){
                     if(tmp[j].split(" ")[1].equals(id_list[i])){
                         hmap.put(tmp[j].split(" ")[0],hmap.get(tmp[j].split(" ")[0])+1);
                     }
                }
            }
        }
        
        for(int i=0; i<id_list.length; i++){
            answer[i] = hmap.get(id_list[i]);
        }
        
        return answer;
    }
}
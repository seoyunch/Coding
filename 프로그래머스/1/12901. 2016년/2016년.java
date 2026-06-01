import java.util.*;

class Solution {
    public String solution(int a, int b) {
        int days = 0;
        while(a>1){
            if(a==3){
                days += 29;
                a--;
            }else if(a==2 || a==4 || a==6 || a==8 || a==9 || a==11){
                days += 31;
                a--;
            }else{
                days += 30;
                a--;
            }
        }
        days += b-1;
        
        HashMap<Integer, String> map = new HashMap<Integer,String>();
        map.put(0, "FRI");
        map.put(1, "SAT");
        map.put(2, "SUN");
        map.put(3, "MON");
        map.put(4, "TUE");
        map.put(5, "WED");
        map.put(6, "THU");
        
        return map.get(days%7);
    }
}
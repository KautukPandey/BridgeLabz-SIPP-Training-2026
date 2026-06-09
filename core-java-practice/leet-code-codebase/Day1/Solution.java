package Day1;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans = 0;
        for(int i=0;i<s.length();i++){
            int currvalue = map.get(s.charAt(i));
            if(i+1<s.length()){
                int nextval = map.get(s.charAt(i+1));
                if(currvalue<nextval) ans-=currvalue;
                else ans+=currvalue;
            }
            else{
                ans+=currvalue;
            }
        }
        return ans;
    }
} 
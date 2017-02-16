import java.util.HashMap;
import java.util.Map;

public class Maxlength {

	public static int maxlength(String s){
		int m=s.length();
		int temp=0;
		int max=0;
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<m;i++){
            if(map.containsKey(s.charAt(i))){  
              if(map.get(s.charAt(i))+1>temp) temp=map.get(s.charAt(i))+1;
              if(i-temp+1>max) max=i-temp+1;
            }	
            else{
            	if(i-temp+1>max)
            		max=i-temp+1;
            }
            map.put(s.charAt(i), i);  
		}
		return max;
	}
	
	public static void main(String args[]){
		System.out.println(maxlength("abcda"));
	}
}

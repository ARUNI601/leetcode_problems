class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        for(char ch :s.toCharArray())
        {
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for( char ch1:t.toCharArray())
        {
            if(map1.containsKey(ch1))
            {
                int newcount=map1.get(ch1);
                if(newcount==1)
                {
                    map1.remove(ch1);
                }
                else
                {
                    map1.put(ch1,newcount-1);
                }
            }
            else
            {
                return false;
            }
        }
    if(map1.isEmpty())
    {
        return true;
    }
    else
    {
        return false;
    }
    }
}